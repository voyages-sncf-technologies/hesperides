pipeline {
    agent {
        node {
            label 'maven3'
        }
    }
    triggers {
        cron('H */30 * * 1-5')
    }
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/voyages-sncf-technologies/hesperides.git', branch: 'feature/springboot'
            }
        }
        stage('Build & test') {
            steps {
                withMaven(mavenSettingsConfig: 'global_maven_settings') {
                    sh "export PATH=$MVN_CMD_DIR:$PATH && mvn help:effective-settings"
                    sh 'mvn clean package -DskipTests -U'
                }
            }
        }
        /*stage('Upload to Nexus') {
            steps {
                withMaven(mavenSettingsConfig: 'global_maven_settings') {
                    sh 'mvn clean deploy -DskipTests -U'
                }
            }
        }*/
        stage('Build image docker') {
            agent {
                node {
                    label 'docker'
                }
            }
            steps {
                script {
                    docker.withRegistry("http://docker-vsct.pkg.cloud.socrate.vsct.fr") {
                        sh "docker build --build-arg http_proxy=http://proxy-hpr:80 --build-arg https_proxy=https://proxy-hpr:80 . -t hesperides/hesperides-spring:latest-snapshot"
                        dockerImage = docker.image("hesperides/hesperides-spring:latest-snapshot")
                        dockerImage.push()
                    }
                }
            }
        }
    }
}

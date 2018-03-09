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
                    sh 'mvn clean package -U'
                }
            }
        }
    }
}

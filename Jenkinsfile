pipeline {
    agent {
        docker {
            image "jimador/docker-jdk-8-maven-node"
        }
    }
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/voyages-sncf-technologies/hesperides.git', branch: 'feature/springboot'
            }
        }
        stage('Build') {
            steps {
                catchError {
                    withMaven(mavenSettingsConfig: 'local_maven_settings') {
                        sh 'mvn clean verify -U'
                    }
                }
            }
        }
    }
}

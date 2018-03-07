pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/voyages-sncf-technologies/hesperides.git', branch: 'feature/springboot'
            }
        }
        stage('Build') {
            agent {
                node {
                    label 'maven3'
                }
            }
            steps {
                catchError {
                    withMaven(mavenSettingsConfig: 'global_maven_settings') {
                        sh "export PATH=$MVN_CMD_DIR:$PATH && mvn help:effective-settings"
                        sh 'mvn clean verify -U'
                    }
                }
            }
        }
    }
}

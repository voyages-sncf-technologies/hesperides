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
                    withMaven(mavenSettingsConfig: 'local_maven_settings') {
                        sh 'mvn clean verify -U'
                    }
                }
            }
        }
    }
}

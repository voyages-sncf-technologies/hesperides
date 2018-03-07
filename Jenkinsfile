pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/voyages-sncf-technologies/hesperides.git', branch: 'feature/springboot'
            }
        }
        stage('Build') {
            steps {
                withMaven {
                    sh 'mvn clean verify -U'
                }
            }
        }
    }
}

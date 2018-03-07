pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/voyages-sncf-technologies/hesperides.git', branch: 'feature/springboot'
            }
        }
        stage('Build') {
            withMaven {
                sh 'mvn clean verify -U'
            }
        }
    }
}

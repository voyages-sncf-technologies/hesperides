pipeline {
    agent none
    stages {
        stage('SHUT') {
            steps {
                sshagent (credentials: ['2583bb80-8a00-4461-8b13-3a4fe8931855']) {
                    sh 'echo Hello'
                }
            }
        }
    }
}
pipeline {
    agent any
    stages {
        stage('SHUT') {
            steps {
                try {
                    sshagent(['2583bb80-8a00-4461-8b13-3a4fe8931855']) {
                        sh 'ssh washesa3@deadbabyboy-bck "/appl/washesa3/SHUT"'
                    }
                } catch (error) {
                    echo error
                }
            }
        }
    }
}
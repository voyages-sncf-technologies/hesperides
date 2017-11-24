pipeline {
    agent any
    stages {
        stage('SHUT') {
            steps {
                sshagent(['2583bb80-8a00-4461-8b13-3a4fe8931855']) {
                    try {
                        sh 'ssh washesa3@deadbabyboy-bck "/appl/washesa3/SHUT"'
                    } catch (error) {
                        echo error
                    }
                }
            }
        }
        stage('PUPPET') {
            steps {
                sshagent(['2583bb80-8a00-4461-8b13-3a4fe8931855']) {
                    try {
                        sh 'ssh uslrdku1@deadbabyboy-bck "sudo /usr/bin/puppet agent -t"'
                    } catch (error) {
                        echo error
                    }
                }
            }
        }
        stage('BOOT') {
            steps {
                sshagent(['2583bb80-8a00-4461-8b13-3a4fe8931855']) {
                    try {
                        sh 'ssh washesa3@deadbabyboy-bck "/appl/washesa3/BOOT"'
                    } catch (error) {
                        echo error
                    }
                }
            }
        }
    }
}
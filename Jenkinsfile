pipeline {
    agent any
    stages {
        stage('SHUT') {
            steps {
                script {
                    try {
                        sshagent(['2583bb80-8a00-4461-8b13-3a4fe8931855']) {
                            sh 'ssh washesa3@deadbabyboy-bck "/appl/washesa3/SHUT"'
                        }
                    } catch (error) {
                        echo 'Hesperides already stopped'
                    }
                }
            }
        }
        stage('PUPPET') {
            steps {
                script {
                    try {
                        sshagent(['2583bb80-8a00-4461-8b13-3a4fe8931855']) {
                            sh 'ssh uslrdku1@deadbabyboy-bck "sudo /usr/bin/puppet agent -t --certname deadbabyboy.socrate.vsct.fr-stagging"'
                        }
                    } catch (error) {
                    }
                }
            }
        }
        stage('BOOT') {
            steps {
                sshagent(['2583bb80-8a00-4461-8b13-3a4fe8931855']) {
                    sh 'ssh washesa3@deadbabyboy-bck "/appl/washesa3/BOOT"'
                }
            }
        }
    }
}
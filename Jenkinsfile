pipeline {
    agent  any 
    stages {
        stage('build') {
            steps {
                sh 'echo hello world'
                script {
                    simple.info 'Starting'
                    simple.warning 'Nothing to do!'
                    calc.example
                    werbung.anzeige 'Hier koennte Ihre Werbung stehen'
                }    
            }
        }

        stage('post build') {
            steps {
                sh 'echo post build'
                script {
                    complex.info 'Starting'
                    complex.warning 'Nobildthing to do!'
                sh 'echo Ralf hat fertig'

                }
            }
        }



        stage('manuela') {
            steps {
                sh 'echo hello world'
                script {
                    manuela.frage 'Was machen wir heute Abend?'
                }    
            }
        }
        stage('lauri') {
            steps {
                sh 'echo hello world'
                script {
                    laura.warning 'Achtung. Ich komme.'
                    laura.info 'Hiermit bestätige ich die Ankunft.'
                }    
            }
        }
    }
}

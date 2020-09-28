

pipeline {
    agent  any 
    stages {
        stage('build') {
            steps {
                sh 'echo hello world'
                script {
                    simple.info 'Starting'
                    simple.warning 'Nothing to do!'
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

    }
}

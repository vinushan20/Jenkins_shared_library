def call() {
    sh 'trivy image vinushan/youtube:latest > trivyimage.txt'
}
def call() {
    sh 'trivy image vinushan20/youtube:latest > trivyimage.txt'
}
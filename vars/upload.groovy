def call(String filePath, String bucketName) {
    echo "Upload  ${filePath}"
    sh """
        gsutil cp ${filePath} gs://${bucketName}/
    """
}
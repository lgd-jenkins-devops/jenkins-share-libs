def call(String filePath, String bucketName) {
    echo "Upload  ${filePath} to the bucket ${bucketName}..."
    sh """
        ./src/upload.sh ${filePath} ${bucketName}
    """
}
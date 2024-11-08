def call(String filePath, String bucketName) {
    echo "Upload  ${filePath} to the bucket ${bucketName}..."
    sh """
        cat ./src/upload.sh
        ./src/upload.sh ${filePath} ${bucketName}
    """
}
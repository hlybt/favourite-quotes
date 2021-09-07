# favourite-quotes
**Building From Source**
>for Linux/macOS:
 
`./gradlew build`

>for Windows:

`gradlew build`

**Building without tests:**
>for Linux/macOS:

`./gradlew build -x test`

>for Windows:

`gradlew build -x test`

**Running** 
>for Linux/macOS:

`./gradlew bootRun --args="--server.port=9000"`

>for Windows:

`gradlew bootRun --args="--server.port=9000"`

**Using API**
- save a favourite quote: POST http://localhost:9000/quote 

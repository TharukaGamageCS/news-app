# news-app
sample android application with MVVM, hilt and coroutines

### Build With
- [Kotlin] - Programming language for Android
- [Hilt-Dagger] - Standard library to incorporate Dagger dependency injection into an Android application.
- [Retrofit] -  A type-safe HTTP client for Android and Java.
- [Room] - SQLite object mapping library.
- [Coroutines] - For asynchronous
- [LiveData] - Data objects that notify views when the underlying database changes.
- [ViewModel] - Stores UI-related data that isn't destroyed on UI changes.
- [ViewBinding] - Generates a binding class for each XML layout file present in that module and allows you to more easily write code that interacts with views.
- [Jetpack Navigation] - Navigation refers to the interactions that allow users to navigate across, into, and back out from the different pieces of content within your app
- [Glide] - An image loading and caching library for Android focused on smooth scrolling

### Project Architecture
This app uses [MVVM (Model View View-Model)] architecture.

### Note
1. create "config" directory in project level folder.
2. then create "dev.properties" $ "prod.properties" files inside "config" directory.
3. copy and paste below lines in both files created above.

BASE_URL=""
API_KEY=""

4. paste the given api_key and base_url and run the project.

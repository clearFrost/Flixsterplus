# Android Project 4 - *Showtime*

Submitted by: **Jason Kang**

**Showtime** is a movie browsing app that allows users to browse top rated movies in [The Movie Database](https://www.themoviedb.org/?language=en-US) .

Time spent: **15** hours spent in total

## Required Features

The following **required** functionality is completed:

- [x] **Choose any endpoint on The MovieDB API except `now_playing`**
  - Chosen Endpoint: `top_rated`
- [x] **Make a request to your chosen endpoint and implement a RecyclerView to display all entries**
- [x] **Use Glide to load and display at least one image per entry**
- [x] **Click on an entry to view specific details about that entry using Intents**

The following **optional** features are implemented:

- [ ] **Add another API call and RecyclerView that lets the user interact with different data.** 
- [x] **Add rounded corners to the images using the Glide transformations**
- [ ] **Implement a shared element transition when user clicks into the details of a movie**

## Video Walkthrough

Here's a walkthrough of implemented user stories:
<!-- Replace this with whatever GIF tool you used! -->
GIF created with  [ScreenToGif](https://www.screentogif.com/) for Windows
![](https://github.com/clearFrost/Showtime/blob/master/Showtime.gif)
![](https://github.com/clearFrost/Showtime/blob/master/showtime2.gif)

## Notes

The biggest difficulty I had while building this project was packaging up the elements of a movie to use in another activity. In this case it was the DetailActivity. However it was made possible through parcelable, parcelable made it easy to send data between activities and receive data through activities. Understanding the api and deciphering the information was not as bad as I had expected thanks to packages.

## License

    Copyright [2023] [Jason Kang]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

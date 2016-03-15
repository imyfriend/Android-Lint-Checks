Android Lint Checks
===================

Custom Lint checks for Android development.

Checks
------

**RxLifecycle** - Ensures you are binding your Observable subscriptions to the lifecycle of an Activity, Fragment or View
 
~~~gradle
  compile `io.vokal.lint:rxlifecycle:1.0.0
~~~

Compiling
---------

Check out the repository to your local machine via:

`git clone git@github.com:vokal/Android-Lint-Checks.git`

Then, from a terminal, run the following command:

`./gradlew clean build test install`

Now the custom Lint checks have been built, packaged, and installed to your `~/.android/lint` folder.

This can be done individually as well, for example:

`./gradlew clean rxlifecycle:install`

If you don't want the custom Lint checks globally available, instead preferring a project-by-project basis, then there is a second option with the following script:

`./gradlew aarWrapper:assemble`

This wraps the JAR file and generates an aar library file in `aarWrapper/build/outputs/aar/` that may be included as a normal dependency in any Android project - either by copying it to the `libs` folder of an Android application project, adding it to a centralized dependency repo, or any other method for adding a library to a project. Lint will pick up on the inner JAR inside the dependency, thus adding the custom Lint checks to the project. 

Verify
------------
To check that the custom Lint checks are now available, run the following commands:

`lint --show <issue-id>`

For example:

`lint --show RxLifecycle`

`lint --show Todo`

And to actually run the Lint checks, try the following command from a project of your choice:

`./gradlew lint`

Alternatively, you can just use Android Studio's `Analyze->Inspect Code...` menu option.

Enjoy!

License
-------
    The MIT License (MIT)
    
    Copyright (c) 2015 Vokal
    
    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
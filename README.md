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

    Copyright 2016 Vokal

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

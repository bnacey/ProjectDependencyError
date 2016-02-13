# ProjectDependencyError
Example project to illustrate https://code.google.com/p/android/issues/detail?id=200952

lib-b depends on lib-a. Tests written in lib-b cannot import classes from lib-a. app depends on both and tests can import from either.

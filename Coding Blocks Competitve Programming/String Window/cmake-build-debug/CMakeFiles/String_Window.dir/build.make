# CMAKE generated file: DO NOT EDIT!
# Generated by "MinGW Makefiles" Generator, CMake Version 3.17

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Disable VCS-based implicit rules.
% : %,v


# Disable VCS-based implicit rules.
% : RCS/%


# Disable VCS-based implicit rules.
% : RCS/%,v


# Disable VCS-based implicit rules.
% : SCCS/s.%


# Disable VCS-based implicit rules.
% : s.%


.SUFFIXES: .hpux_make_needs_suffix_list


# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = "C:\Program Files\JetBrains\CLion 2020.3.2\bin\cmake\win\bin\cmake.exe"

# The command to remove a file.
RM = "C:\Program Files\JetBrains\CLion 2020.3.2\bin\cmake\win\bin\cmake.exe" -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\String Window"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\String Window\cmake-build-debug"

# Include any dependencies generated for this target.
include CMakeFiles/String_Window.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/String_Window.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/String_Window.dir/flags.make

CMakeFiles/String_Window.dir/main.cpp.obj: CMakeFiles/String_Window.dir/flags.make
CMakeFiles/String_Window.dir/main.cpp.obj: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\String Window\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/String_Window.dir/main.cpp.obj"
	C:\MinGW\bin\g++.exe  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\String_Window.dir\main.cpp.obj -c "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\String Window\main.cpp"

CMakeFiles/String_Window.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/String_Window.dir/main.cpp.i"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\String Window\main.cpp" > CMakeFiles\String_Window.dir\main.cpp.i

CMakeFiles/String_Window.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/String_Window.dir/main.cpp.s"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\String Window\main.cpp" -o CMakeFiles\String_Window.dir\main.cpp.s

# Object files for target String_Window
String_Window_OBJECTS = \
"CMakeFiles/String_Window.dir/main.cpp.obj"

# External object files for target String_Window
String_Window_EXTERNAL_OBJECTS =

String_Window.exe: CMakeFiles/String_Window.dir/main.cpp.obj
String_Window.exe: CMakeFiles/String_Window.dir/build.make
String_Window.exe: CMakeFiles/String_Window.dir/linklibs.rsp
String_Window.exe: CMakeFiles/String_Window.dir/objects1.rsp
String_Window.exe: CMakeFiles/String_Window.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\String Window\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable String_Window.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\String_Window.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/String_Window.dir/build: String_Window.exe

.PHONY : CMakeFiles/String_Window.dir/build

CMakeFiles/String_Window.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\String_Window.dir\cmake_clean.cmake
.PHONY : CMakeFiles/String_Window.dir/clean

CMakeFiles/String_Window.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\String Window" "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\String Window" "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\String Window\cmake-build-debug" "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\String Window\cmake-build-debug" "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\String Window\cmake-build-debug\CMakeFiles\String_Window.dir\DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/String_Window.dir/depend


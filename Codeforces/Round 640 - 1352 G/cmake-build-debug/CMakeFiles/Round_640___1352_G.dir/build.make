# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.17

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

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /snap/clion/145/bin/cmake/linux/bin/cmake

# The command to remove a file.
RM = /snap/clion/145/bin/cmake/linux/bin/cmake -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = "/media/rohan/Rondon/Personal Coding Material/All-My-Coding-Problems/Codeforces/Round 640 - 1352 G"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "/media/rohan/Rondon/Personal Coding Material/All-My-Coding-Problems/Codeforces/Round 640 - 1352 G/cmake-build-debug"

# Include any dependencies generated for this target.
include CMakeFiles/Round_640___1352_G.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/Round_640___1352_G.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/Round_640___1352_G.dir/flags.make

CMakeFiles/Round_640___1352_G.dir/main.cpp.o: CMakeFiles/Round_640___1352_G.dir/flags.make
CMakeFiles/Round_640___1352_G.dir/main.cpp.o: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/media/rohan/Rondon/Personal Coding Material/All-My-Coding-Problems/Codeforces/Round 640 - 1352 G/cmake-build-debug/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/Round_640___1352_G.dir/main.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/Round_640___1352_G.dir/main.cpp.o -c "/media/rohan/Rondon/Personal Coding Material/All-My-Coding-Problems/Codeforces/Round 640 - 1352 G/main.cpp"

CMakeFiles/Round_640___1352_G.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Round_640___1352_G.dir/main.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "/media/rohan/Rondon/Personal Coding Material/All-My-Coding-Problems/Codeforces/Round 640 - 1352 G/main.cpp" > CMakeFiles/Round_640___1352_G.dir/main.cpp.i

CMakeFiles/Round_640___1352_G.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Round_640___1352_G.dir/main.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "/media/rohan/Rondon/Personal Coding Material/All-My-Coding-Problems/Codeforces/Round 640 - 1352 G/main.cpp" -o CMakeFiles/Round_640___1352_G.dir/main.cpp.s

# Object files for target Round_640___1352_G
Round_640___1352_G_OBJECTS = \
"CMakeFiles/Round_640___1352_G.dir/main.cpp.o"

# External object files for target Round_640___1352_G
Round_640___1352_G_EXTERNAL_OBJECTS =

Round_640___1352_G: CMakeFiles/Round_640___1352_G.dir/main.cpp.o
Round_640___1352_G: CMakeFiles/Round_640___1352_G.dir/build.make
Round_640___1352_G: CMakeFiles/Round_640___1352_G.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="/media/rohan/Rondon/Personal Coding Material/All-My-Coding-Problems/Codeforces/Round 640 - 1352 G/cmake-build-debug/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable Round_640___1352_G"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/Round_640___1352_G.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/Round_640___1352_G.dir/build: Round_640___1352_G

.PHONY : CMakeFiles/Round_640___1352_G.dir/build

CMakeFiles/Round_640___1352_G.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/Round_640___1352_G.dir/cmake_clean.cmake
.PHONY : CMakeFiles/Round_640___1352_G.dir/clean

CMakeFiles/Round_640___1352_G.dir/depend:
	cd "/media/rohan/Rondon/Personal Coding Material/All-My-Coding-Problems/Codeforces/Round 640 - 1352 G/cmake-build-debug" && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" "/media/rohan/Rondon/Personal Coding Material/All-My-Coding-Problems/Codeforces/Round 640 - 1352 G" "/media/rohan/Rondon/Personal Coding Material/All-My-Coding-Problems/Codeforces/Round 640 - 1352 G" "/media/rohan/Rondon/Personal Coding Material/All-My-Coding-Problems/Codeforces/Round 640 - 1352 G/cmake-build-debug" "/media/rohan/Rondon/Personal Coding Material/All-My-Coding-Problems/Codeforces/Round 640 - 1352 G/cmake-build-debug" "/media/rohan/Rondon/Personal Coding Material/All-My-Coding-Problems/Codeforces/Round 640 - 1352 G/cmake-build-debug/CMakeFiles/Round_640___1352_G.dir/DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/Round_640___1352_G.dir/depend


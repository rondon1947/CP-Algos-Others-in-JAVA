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
CMAKE_SOURCE_DIR = "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Birthday Paradox"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Birthday Paradox\cmake-build-debug"

# Include any dependencies generated for this target.
include CMakeFiles/Birthday_Paradox.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/Birthday_Paradox.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/Birthday_Paradox.dir/flags.make

CMakeFiles/Birthday_Paradox.dir/main.cpp.obj: CMakeFiles/Birthday_Paradox.dir/flags.make
CMakeFiles/Birthday_Paradox.dir/main.cpp.obj: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Birthday Paradox\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/Birthday_Paradox.dir/main.cpp.obj"
	C:\MinGW\bin\g++.exe  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\Birthday_Paradox.dir\main.cpp.obj -c "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Birthday Paradox\main.cpp"

CMakeFiles/Birthday_Paradox.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Birthday_Paradox.dir/main.cpp.i"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Birthday Paradox\main.cpp" > CMakeFiles\Birthday_Paradox.dir\main.cpp.i

CMakeFiles/Birthday_Paradox.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Birthday_Paradox.dir/main.cpp.s"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Birthday Paradox\main.cpp" -o CMakeFiles\Birthday_Paradox.dir\main.cpp.s

# Object files for target Birthday_Paradox
Birthday_Paradox_OBJECTS = \
"CMakeFiles/Birthday_Paradox.dir/main.cpp.obj"

# External object files for target Birthday_Paradox
Birthday_Paradox_EXTERNAL_OBJECTS =

Birthday_Paradox.exe: CMakeFiles/Birthday_Paradox.dir/main.cpp.obj
Birthday_Paradox.exe: CMakeFiles/Birthday_Paradox.dir/build.make
Birthday_Paradox.exe: CMakeFiles/Birthday_Paradox.dir/linklibs.rsp
Birthday_Paradox.exe: CMakeFiles/Birthday_Paradox.dir/objects1.rsp
Birthday_Paradox.exe: CMakeFiles/Birthday_Paradox.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Birthday Paradox\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable Birthday_Paradox.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\Birthday_Paradox.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/Birthday_Paradox.dir/build: Birthday_Paradox.exe

.PHONY : CMakeFiles/Birthday_Paradox.dir/build

CMakeFiles/Birthday_Paradox.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\Birthday_Paradox.dir\cmake_clean.cmake
.PHONY : CMakeFiles/Birthday_Paradox.dir/clean

CMakeFiles/Birthday_Paradox.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Birthday Paradox" "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Birthday Paradox" "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Birthday Paradox\cmake-build-debug" "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Birthday Paradox\cmake-build-debug" "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Birthday Paradox\cmake-build-debug\CMakeFiles\Birthday_Paradox.dir\DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/Birthday_Paradox.dir/depend


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
CMAKE_SOURCE_DIR = "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Travas and Saddas"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Travas and Saddas\cmake-build-debug"

# Include any dependencies generated for this target.
include CMakeFiles/Travas_and_Saddas.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/Travas_and_Saddas.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/Travas_and_Saddas.dir/flags.make

CMakeFiles/Travas_and_Saddas.dir/main.cpp.obj: CMakeFiles/Travas_and_Saddas.dir/flags.make
CMakeFiles/Travas_and_Saddas.dir/main.cpp.obj: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Travas and Saddas\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/Travas_and_Saddas.dir/main.cpp.obj"
	C:\MinGW\bin\g++.exe  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\Travas_and_Saddas.dir\main.cpp.obj -c "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Travas and Saddas\main.cpp"

CMakeFiles/Travas_and_Saddas.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Travas_and_Saddas.dir/main.cpp.i"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Travas and Saddas\main.cpp" > CMakeFiles\Travas_and_Saddas.dir\main.cpp.i

CMakeFiles/Travas_and_Saddas.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Travas_and_Saddas.dir/main.cpp.s"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Travas and Saddas\main.cpp" -o CMakeFiles\Travas_and_Saddas.dir\main.cpp.s

# Object files for target Travas_and_Saddas
Travas_and_Saddas_OBJECTS = \
"CMakeFiles/Travas_and_Saddas.dir/main.cpp.obj"

# External object files for target Travas_and_Saddas
Travas_and_Saddas_EXTERNAL_OBJECTS =

Travas_and_Saddas.exe: CMakeFiles/Travas_and_Saddas.dir/main.cpp.obj
Travas_and_Saddas.exe: CMakeFiles/Travas_and_Saddas.dir/build.make
Travas_and_Saddas.exe: CMakeFiles/Travas_and_Saddas.dir/linklibs.rsp
Travas_and_Saddas.exe: CMakeFiles/Travas_and_Saddas.dir/objects1.rsp
Travas_and_Saddas.exe: CMakeFiles/Travas_and_Saddas.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Travas and Saddas\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable Travas_and_Saddas.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\Travas_and_Saddas.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/Travas_and_Saddas.dir/build: Travas_and_Saddas.exe

.PHONY : CMakeFiles/Travas_and_Saddas.dir/build

CMakeFiles/Travas_and_Saddas.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\Travas_and_Saddas.dir\cmake_clean.cmake
.PHONY : CMakeFiles/Travas_and_Saddas.dir/clean

CMakeFiles/Travas_and_Saddas.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Travas and Saddas" "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Travas and Saddas" "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Travas and Saddas\cmake-build-debug" "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Travas and Saddas\cmake-build-debug" "D:\Personal Coding Material\All-My-Coding-Problems\Coding Blocks Competitve Programming\Travas and Saddas\cmake-build-debug\CMakeFiles\Travas_and_Saddas.dir\DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/Travas_and_Saddas.dir/depend


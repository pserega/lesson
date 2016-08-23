echo on
rem echo ^<?xml version="1.0" encoding="UTF-8"?^>^<testsuites^>^<testsuite name="*TEST.PLUS_v5*" tests="1" failures="0" time=",001" timestamp="2016-08-22T23:24:45.929000+03:00"^>^<testcase name="TEST.PLUS:Test Implementation 1:2_RUNTEST" classname="TEST.PLUS" time=",001"/^>^</testsuite^>^</testsuites^> > text.xml
setlocal enableextensions enabledelayedexpansion
set n=17
set File_Src=junit_suite_PLUS_v5.html
set file_Dest=junit_suite_PLUS_v5.xml
 
more +%n% < "%File_Src%" > "%file_Dest%"

@echo off
::Введите полный путь к текстовому файлу
set file=junit_suite_PLUS_v5.xml
::Задайте временный служебный файл
set tmpfile=junit_suite_PLUS_v5_temp.xml
 
if exist "%tmpfile%" del /f "%tmpfile%"

rem ^| findstr /BV "</div>"^| findstr /BV "</body>"^| findstr /BV "</html>"

for /f "delims=] tokens=1*" %%a in ('find /v /n "" ^<"%file%" ^| findstr /V "</pre>" ^| findstr /V "</div>" ^| findstr /V "</body>" ^| findstr /V "</html>"  ^| findstr /V "dmdiet" ^| findstr /V "nelsonwells" ^| findstr /V "Jenkins"') do (
  Echo.%%b>>"%tmpfile%"
)
move /y "%tmpfile%" "%file%"

rem set n=0
rem more +%n% < "%file_Dest%" > "%file_Dest1%"
rem rename junit_suite_PLUS_v5.html junit_suite_PLUS_v5.xml

rem cd /d "C:\Program Files (x86)\Jenkins\workspace\unit_plus\"

rem setlocal enableextensions enabledelayedexpansion
rem set file_Dest=junit_suite_PLUS_v5.xml
rem set file_Dest1=junit_suite_PLUS_v5_1.xml
rem set n=0
rem more +%n% < "%file_Dest%" > "%file_Dest1%"




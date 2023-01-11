@echo off

if exist "main_pack.java" set filename=main_pack.java & goto :pass
set /p filename="Entrez le nom du fichier : "
if not exist "%filename%" echo. & ECHO Fichier introuvable. & echo. & goto no
echo.
javac %filename%
echo.
java %filename:~0,-5%
goto no
:pass
DEL *.class
set folder="lesclasses"
if exist "%folder%" cd %folder% & DEL *.class & cd ..
javac %filename%
java %filename:~0,-6%
echo.
:no
@pause


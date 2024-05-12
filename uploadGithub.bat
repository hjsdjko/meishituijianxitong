@echo off

for /D %%i in (*) do (
    if not "%%i"=="mp-weixin" (
        git init && git add . && git commit -m "first commit" && git branch -M main && git remote add origin https://github.com/hjsdjko/%%i.git && git push -u origin main
    )
)

powershell -c (New-Object Media.SoundPlayer "C:\Users\22612\Desktop\y1249.wav").PlaySync()

pause
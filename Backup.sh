read -n 1 -p "Backup this directory (y/[a]): " AMSURE 
[ "$AMSURE" = "y" ] || exit echo "" 1>&2


git init
git status
sleep .1
git add .

git commit -m"backupALL"
sleep .1
git log
sleep 3
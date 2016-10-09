read -n 1 -p "Restore this directory from backup (y/[a]): " AMSURE 
[ "$AMSURE" = "y" ] || exit echo "" 1>&2


git status
sleep .2
git reset --hard master
sleep .2
git log


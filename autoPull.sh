# /bin/bash

diretorioRaiz=`pwd`

for var in "$@" # Foreach de todos os argumentos passados por parametro 
do
	cd $var # Entra na pasta
	if [ -d ".git" ]; then # É um repositório Git
		echo "- Executando pull em "$var "$(tput sgr 0)"
		git pull # Executa pull
	fi
	cd $diretorioRaiz # Volta a pasta raiz do projeto, usando path raiz para caso o git seja um sub-diretorio
done;

echo ""
echo ""
echo ""
echo -e "developed by: \e[1;42malbertrein\e[0m" 

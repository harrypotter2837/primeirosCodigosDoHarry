# Primeiros Codigos e Dicas de Git

### Iniciar um novo repositório local:
git init

### Verificar se há mudanças no repositório:
git status

### Configurando o seu usuario e email no Git:
git config --global user.name "Nome"
git config --global user.email "seuemail@email.com"

### Criando uma branch:
git branch -b nome_da_branch

### Merge de um branch no main:
git checkout main
git merge nome_da_branch

### Ver todo o histórico de alterações feito no repositório:
git log

### Deletar branch:
- localmente: git branch -d <branch>
- remotamente: git push origin --delete <branch>

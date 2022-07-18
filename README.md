# Challenge ONE | Java | Back-end | Hotel Alura

<p align="center" >
     <img width="300" heigth="300" src="https://user-images.githubusercontent.com/101413385/173164615-192ca98a-1a44-480e-9229-9f82f456eec8.png">

</p>

---
##  Primeiros Passos:

#### 🔹 Marque esse projeto com uma ⭐
#### 🔹 Siga as orientações do que temos neste repositório 📚
#### 🔹 Visite a página do desafio clicando aqui! [Link do Challenge](https://www.alura.com.br/challenges/oracle-one-java) 📃 
</br>

## 🖥️ Tecnologias Utilizadas:

- Java
- Eclipse
- MySql
- Biblioteca JCalendar
- Plugin WindowBuilder </br>

---
## ⚠️ Importante! ⚠️

☕ Use o Java na versão 8 para ter compatibilidade. 
</br></br>
📝 Recomendamos utilizar o editor Eclipse para compatibilidade da interface gráfica. </br></br>
🎨 A interface contém dois importantes métodos:
- setResizable(false): determina o tamanho da janela, e através do parâmetro <strong>false</strong>, a tela não poderá ser maximizada;
- setLocationRelativeTo(null): determina a localização da janela, e através do parâmetro <strong>null</strong> ele a mantém centralizada na tela.

#### Para este desafio, concentre-se na parte lógica e de conexão com o Banco de Dados, após concluir o desafio, sinta-se a vontade para incluir novas funcionalidades e modificar a interface gráfica. 


---


## 🔍 Analisando nosso repositório!

### Este é o repositório base do nosso projeto, nele você encontrará:
#### 🔹 src/views: pasta com toda a interface gráfica das telas necessárias para desenvolver o programa;
#### 🔹 src/imagens: pasta com imagens que você pode utilizar em seu projeto. Sinta-se a vontade para utilizar outras, caso deseje.
</br>

## ⬇️ Download

### Como fazer o download: 

#### 🔹 Fork
1 - Faça o <strong>fork</strong> do projeto. No lado superior direito, ao clicar no ícone ele criará um repositório do projeto em sua conta pessoal do GitHub. </br>

<p align="center" >
     <img width="600" heigth="600" src="https://user-images.githubusercontent.com/101413385/169404781-7df6355b-3a15-472a-8d8e-fdb84d91a7bd.png">
</p>
</br>

2 - Após ter o repositório "forkado" para sua conta, verifica se a url da página é a do repositório da sua conta.

<p align="center" >
     <img width="600" heigth="600" src="https://user-images.githubusercontent.com/101413385/173165925-5f1c14ec-3f6c-4a92-b59e-835499f15581.png">
</p></br>

3 - Clique na opção <strong>Code</strong>. Ele apresentará três formas para instalar o repositório em sua máquina, e destacamos duas:

<p align="center" >
     <img width="600" heigth="600" src="https://user-images.githubusercontent.com/101413385/173166461-e62d9704-98d5-4773-a60e-57d5729575ae.png">
</p></br>

#### 🔹 Clonar ou baixar o ZIP

1 - Para clonar, basta copiar a <em>url</em> destacada na imagem e localizada logo abaixo do HTTPS, criar uma pasta em seu computador, abrir o <em>cmd</em> ou o <em>git bash</em> dentro dessa pasta e em seguida insira o comando <strong>git clone</strong> e com o botão direito do mouse dentro do terminal clicar na opção <strong>Paste</strong> para colar a <em>url</em> e dar <em>Enter</em>. 

<p align="center" >
     <img width="600" heigth="600" src="https://user-images.githubusercontent.com/101413385/173166777-82027ee7-cb89-48da-ab1c-3ef2397f6a9f.png">
</p></br>

2 - A segunda opção é baixar o código em um pacote <strong>"zipado"</strong> e extrair a pasta para o seu computador. 
</br></br>

## 📝 Eclipse

### Como importar o meu projeto no Eclipse?

1 - Uma vez dentro do Editor do lado esquerdo, clique em <em>File</em> que está no menu na parte superior, escolha a opção <em>Open Projects from File System</em>.

<p align="center" >
     <img width="400" heigth="400" src="https://user-images.githubusercontent.com/101413385/173164237-1db32d79-2b35-433f-817c-ec3fa30899fc.png">
</p>

Em seguida, clique em <em>Directory</em> e localize o diretório do projeto "clonado" ou "extraído" em seu computador. Clique em <em>Finish</em> para concluir a importação.

<p align="center" >
     <img width="600" heigth="600" src="https://user-images.githubusercontent.com/101413385/173110215-f9451a5e-a9eb-4056-aec8-6eb3e3601e53.png">
</p>


2 - A segunda forma de importar está em <em>File</em> na opção <em>Import</em>. Ou através do <strong>Project Explorer</strong>, clique no campo vazio com o botão direito do mouse e escolha a opção <em>Import</em>.

<p align="center" >
     <img width="400" heigth="400" src="https://user-images.githubusercontent.com/101413385/173111357-2ec928ac-5a3d-4f7c-ba84-8906d84bfd08.png">
</p>

<p align="center" >
     <img width="400" heigth="400" src="https://user-images.githubusercontent.com/101413385/169431325-23a2e3cb-85a3-4298-8e60-64dfa58e2e6f.png">
</p>


Se optar pelo <strong>Import</strong>, abrirá a janela correspondente, clique na opção <em>Existing Projects Into Workspace</em> e no botão <em>Next</em>.

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/169431890-27f40955-27d8-4b4d-82df-d3507f85de6c.png">
</p>

Em seguida, clique no botão <em>Browse</em> e busque o projeto no diretório local.

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/169432246-a769555c-daf9-490e-a0c7-908f7e5de967.png">
</p>

## 📅 JCalendar

Após importar para o seu editor, é necessário instalar a biblioteca <strong>JCalendar</strong>, caso contrário o projeto apresentará um erro e não será possível abrir a janela de <strong>Reservas</strong>. </br>

Para instalar, você precisa baixar o pacote através desse link:
🔹 [Link para o JCalendar](https://toedter.com/jcalendar/)

<p align="center" >
     <img width="600" heigth="600" src="https://user-images.githubusercontent.com/101413385/169592420-7ea798d4-b7d2-4fd6-a03c-75f0fbc2e4bc.png">
</p>

A próxima etapa será extrair os arquivos da pasta <strong>lib</strong> para uma pasta local e importar os arquivos para o Eclipse. 

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173167366-664a8876-a5c9-45d1-880d-650fbd6f8b07.png">     
</p>

Arquivos da pasta <strong>lib</strong>:
<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173167517-ed6edd9e-7d56-486f-8d47-f50e7ee2c786.png">
</p>

Clique com o botão direito do mouse sobre o projeto localizado no <strong>Package Explorer</strong> e escolha a opção <em>Build Path</em> e <em>Configure Build Path</em>.

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173167991-44b111ca-c2d6-4d83-b225-33eb2657448f.png">
</p>

O projeto estará com um aviso de erro, indicando que não existe a rota da biblioteca em seu computador. Clique em <em>Libraries</em>, em seguida em <em>Classpath</em>
selecione o arquivo do JCalendar, escolha a opção <em>Remove</em> e <em>Apply and Close</em>.

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173167817-ddbdedc5-c4a6-4f6d-bd86-f86a153d6b88.png">
</p>

Para importar o <strong>Jcalendar</strong> do seu computador, após ter "extraído" os arquivos do download, clique em <em>Classpath</em> e depois em <em>Add External JARS</em> adicione um a um e clique em <em>Apply and Close</em>.

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/169596029-a9fa21ef-8d90-45a6-8aa2-be2d911d4074.png">
</p>

Assim, o projeto deve conter os seguintes arquivos após as importações:

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173168583-f6352510-d639-40ef-8339-c161688e78a3.png">
</p>


## 🚧 Projeto

#### Ao clonar ou baixar o projeto base e ter o JCalendar instalado, você terá esta apresentação ao executar o projeto no Eclipse:

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173168721-5c1b8405-2615-4599-a8bd-079249d7fadd.png">
</p>

### ⚠️ Baixei o projeto, mas os caracteres especiais não funcionam:

Caso o seu projeto apresente erros como os da imagem, siga os passos abaixo:

<p align="center" >
     <img width="600" heigth="600" src="https://user-images.githubusercontent.com/101413385/173694166-189f3bce-070d-4f33-9a1d-7a9f1de95bb8.png">
</p>

Vá até <em>Window</em> e clique em <em>Preferences</em>.

<p align="center" >
     <img width="200" heigth="200" src="https://user-images.githubusercontent.com/101413385/173693126-8e2fec8b-91b1-4007-bbc5-010bb454f440.png">
</p>

Em seguida, clique em <em>General</em> e <em>Workspace</em>. Se o seu <em>Text File Enconding</em> não estiver com o <strong>Default (UTF-8)</strong>, clique em <em>Other</em>, e escolha a opção <strong>UTF-8</strong> e finalize clicando em <em>Apply and Close</em>.

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173691963-1e3d966e-5162-4393-9232-d5d395d5440f.png">
</p>

## 📊 Banco de Dados

### Como importar o MySqlConnector no projeto?

É o mesmo caminho descrito para a importação do <strong>JCalendar</strong>, clicar com o botão direito do mouse em cima do projeto, <em>Build Path</em>, <em>Configure Build Path</em>, <em>Libraries</em>, <em>Add External JARs</em>. Para encontar o caminho desse aquivo <strong>.jar</strong>, vá até o disco rígido do seu computador e entre na pasta <em>Arquivos de Programas (x86)</em>.

- Arquivos de Programas (x86):
<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173169394-a67b528a-c8b7-4f7a-b374-a1da81b1cc5d.png">
</p>

- MySQL
<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173169551-b32a9978-3a05-4b6e-b077-f586d0c41e31.png">
</p>

- Connector J 8.0:

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173169584-48e21a03-e70f-4a65-9197-448a3645f526.png">
</p>

- My SQL Connector Java:
<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173169737-5f93868e-df8f-4177-90ba-faf9570758ac.png">
</p>

### Modelagem das tabelas:

Para este desafio propomos duas tabelas: <strong>Reservas</strong> e <strong>Hóspedes</strong>. A tabela de hóspedes deve conter a chave estrangeiro <em>(foreign key)</em> <strong>idReserva</strong>.

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/169434993-1d494d38-d122-457d-b973-52b42270114b.png">
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/91544872/173657744-d6a5887a-8f37-4baa-afa0-e3e8ba5e1373.png">
</p>

## 🗔 Plugin WindowBuilder

No menu do <strong>Eclipse</strong>, vá até a aba <em>Help</em> e selecione a opção <em>Eclipse Marketplace</em>.

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173254683-a4d27b04-3994-4c7b-bf70-6e1b665a5452.png">
</p>

Na barra de pesquisa, insira <strong>window builder</strong> e clique em <em>Go</em>. Após a busca, selecione a primeira opção e clique em <em>Install</em>.

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173254936-b1ed41ba-af1b-47ae-bf75-00de4a22ff19.png">
</p>

Na próxima janela, selecione o botão <em>Confirm</em>.

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173255237-94789460-0544-4dd3-b00d-2738b83bd575.png">
</p>

Clique na opção para aceitar os Termos de Uso, e para concluir clique em <em>Finish</em>.

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173255298-05ac80f1-3e93-4097-90af-7fc8a4fa1611.png">
</p>

     
## 📬 Entrega

### Como incluir meu projeto com a "#" do desafio?

1) Tenha o <strong>Fork</strong> do projeto em seu repositório no Github.
2) Utilize o tópico **#challengeonealurahotelbr2**. Vá na aba esquerda do seu projeto na seção <em>About</em> e clique na engrenagem de configuração selecione o campo **topics** e insira a etiqueta **challengeonealurahotelbr2**.


![gif-vitrine](https://user-images.githubusercontent.com/91544872/153601047-62aee6cb-e3cf-42b3-92c3-7130c996113f.gif)

### Como faço a entrega final do meu Projeto?

4) Preencha o formulário a seguir com seus dados pessoais, juntamente com o link do seu repositório.🔹 [Link para o formulário](https://lp.alura.com.br/alura-latam-lp-entrega-de-challenge-one)

<p align="center" >
     <img width="700" heigth="700" src="https://user-images.githubusercontent.com/91544872/179625416-62a037d0-3337-47b9-9fe0-a262f35bb9b5.png">
</p>


5) Vá para seu e-mail e resgate sua badge conquistada por encerrar mais um desafio no Projeto ONE! 🏆

6) Não se esqueça de colocar um link ou vídeo de seu projeto no Linkedin! Marque com a #Oracle #AluraLatam 🏁


🧡 <strong>Oracle</strong></br>
<a href="https://www.linkedin.com/company/oracle/" target="_blank">
<img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>

💙 <strong>Alura Latam</strong></br>
<a href="https://www.linkedin.com/company/alura-latam/mycompany/" target="_blank">
<img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>

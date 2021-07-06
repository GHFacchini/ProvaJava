# ProvaJava

#### O arquivo compactado possui um CSV com 560692 linhas com os dados de isolamentos sociais de uma pesquisa brasileira 
#### Para preservar a integridade dos dados da pesquisa eu modifiquei o arquivo original utilizando um nextDouble() no lugar do dado de isolamento.

#### Atividade 1:
Consiste na implementação da interface gráfica da aplicação. Utilize a ferramenta “designer” do NetBeans para
implementar a interface gráfica da aplicação utilizando os devidos componentes gráficos, conforme a Figura 2. Note
que, há cinco campos JTextField que devem inicialmente aparecer desabilitados, e estão em cinza conforme a
interface.

#### Atividade 2:
Implementação do seletor de arquivos no botão “Select...”. Faça uso de um componente JFileChooser para que o
usuário possa navegar e selecionar um arquivo com a extensão “.csv” na caixa de diálogo. O nome do arquivo
selecionado deve ser exibido no respectivo componente JTextField.

#### Atividade 3:
Implementação da leitura inicial de dados. Imediatamente após ser selecionado o arquivo pelo usuário, os seguintes
campos devem ser preenchidos com dados oriundos de sua leitura: número de cidades e número de estados. Deve-
se levar em conta nas contagens apenas nomes únicos, ou seja, sem repetição. Devem ser ainda preenchidos os
componentes “JComboBox” com os nomes de estados e cidades (sem repeti-los) oriundos do arquivo selecionado.

#### Atividade 4:
Listagem dos índices de isolamento social na tabela. Registre e implemente uma ação de click de mouse sobre o
botão “Find” de forma que sejam exibidos na tabela todos os índices de isolamento social (coluna Isolated) em cada
data (coluna Date) que se tem registro no arquivo “.csv” selecionado.

#### Atividade 5:
Descoberta de índices de isolamento. Na parte inferior da interface, há dois campos representados por componentes
JTextField que estão desabilitados (ou também podemos dizer, em modo de exibição). Usando seu conhecimento
desenvolva um algoritmo para que tão logo o usuário clique no botão “Find”, o arquivo “.csv” seja pesquisado e se
localize a cidade com o índice de isolamento mais alto, assim como a cidade com o índice de isolamento mais baixo.
Exiba em cada um dos campos a informação no seguinte formato:

nome_da_cidade / estado (data) → índice_de_isolamento |
------------------------------------------------------|
#### Atividade 6:
Exportação de dados. Registre e implemente uma ação para o botão “Export Data” de maneira que ao ser clicado
este botão execute um código que exporta o conteúdo da JTable com os índices de isolamento social da cidade
selecionada para um arquivo TXT, sendo que cada linha deve armazenar o índice para uma data, conforme o seguinte
layout:

nome_da_cidade / estado|
-----------------------|
[contador_sequencial];[data];[índice_de_isolamento]|

#### Atividade 7:
Encerramento da aplicação. Registre e implemente uma ação no botão “Close Application” para que ao ser clicado o
mesmo encerre a execução da aplicação. No entanto, antes de fechá-la a aplicação deverá solicitar uma confirmação
ao usuário para ver se ele quer mesmo encerrar a aplicação.






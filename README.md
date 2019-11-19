# Design_Patterns-in-Object_Oriented-Java
Implementation of a medical clinic management application using OO and Generic Methods as long Design Patterns as Prototype alowing objects clonation of a estructure

UFVJM - University disciplines envolved: Object_Oriented_Programming

• Classes Arvores
A classe Arvore Binária do trabalho anterior foi desdobrada em 3 Classes arvores
com o intuito de tratar o tipo de dado a ser armazenado e manipulado para cada
uma dos diferentes tipos de classes que implementam a interface Comparable (ga-
rantem a presença do método compareTO necessário para manipulação de objetos
na estrutura de arvore binária) sendo estas: Consulta, Paciente e Funcionário e suas
subclasses. Implementação da estrutura:

– Add(T obj)
Método que deve ser chamado para possibilitar a inserção de elementos na
coleção de arvore. Primeiramente o método verifica o estado do atributo raiz
da arvore, caso este ainda não tenha objeto atribuı́do, a inserção se dá naquele
primeiro nó criando uma instancia do tipo ”NO”e atribuı́do ao atributo raiz e
adicionando uma unidade ao atributo size da arvore.
Caso a raiz já tenha atribuição, o método Add então faz o uso do método
CompareTo do objeto passado por parâmetro(que estende Comparable) e de-
termina se o objeto passado contem um valor maior, menor ou igual que a
raiz atual sendo comparada na arvore (CompareTo: ¡0 — ¿0 — =0), assim a
arvore ’anda’ na direção de inserção correta de acordo com os valores presentes
na objeto passado por parâmetro e os valores já contidos no interior da arvore.
Esta comparação é feita dentro de um laço While(True) que se repetirá até que
o nó de inserção correto e nulo seja encontrado retornando assim True. Caso
o objeto já esteja na coleção, é retornado False e o objeto não é adicionado
novamente por esta não ser um prática prevista na implementação de Arvores
de Pesquisa Binária.

– percorrer()
O método percorrer é que realmente ’Anda’ na estrutura de Arvore binária
usando somente a estrutura de Iterator implementada na classe aninhada à
classe arvore TreeIterator. O método percorrer instancia um objeto do tipo
Iterator e através deste chama e exibe o resultado da função next() implemen-
tado da interface Iterator. Essa chamada ao método next() é feita dentro de
um laço while que se repete enquanto a função hasNext(), também do Iterator,
seja verdadeira.

– size()
Este método simplesmente retorna o valor do atributo size da classe arvore,
representado o numero de elementos atualmente presentes na coleção.

– Iterator()
Este método é responsável por instanciar um objeto do tipo TreeIterator retor-
nando este objeto para que os métodos de interação da arvore sejam acessı́veis
para todo o controle e manutenção da coleção.

– conteins(Object obj)
A função é responsável por retornar True caso um objeto passado por parâmetro
4esteja na coleção ou false caso contrário. Primeiramente foi implementada
uma variaáel do tipo boolean para controle da estrutura, instanciado o ite-
rator da arvore e em seguida, dentro de um laço hasNext() é feita a com-
paração(CompareTo) do objeto passado por parâmetro com cada objeto pre-
sente na arvore. Quando os objetos forem iguais, a variável de controle é setada
como True e retornada, significando que o elemento passado por parâmetro está
presente na estrutura.

– isEmpty()
Este método faz a verificação do atributo raiz da classe Arvore, caso este tenha
valor null (significando que não há elementos presentes na arvore) é retornado
um true, caso não (existem elemento(s) na arvore) o método retorna false.

– remove(Object obj)
Método com o propósito de, informado um obj qualquer por meio dos parâmetros
da função, localizar este objeto na arvore e, se encontrado, fazer uma chamada
de método via Iterador para remover o elemento da estrutura de arvore de
pesquisa binária. o método remove de TreeIterator é responsável pela redistri-
buição de referências da arvore, garantindo sua integridade. Caso o elemento
informado como parâmetro tenha sido encontrado na arvore, a função retorna
True, caso negativo retorna False.

– gravarElementos
Esta função realiza a passagem dos elementos presentes na coleção de arvore
para um arquivo qualquer de nome escolhido pelo usuário utilizando as im-
portações de pacote do java io.File, io.File.OutputStream e io.ObjectOutputStream
para regular o fluxo de dados entre o softhware e o arquivo: file: arquivos, out-
putStream para fluxo de dados e ObjectoutputStream para fluxo de objetos.
Além da importação java.io.IOException usado para o catch de erro de fluxo
de aruivo no bloco try.

– importElementos
Método usado para a recuperação de objetos gravados em arquivos, adicionando-
os à estrutura de coleção da mesma maneira e estrutura apresentada no método
anterior porém no sentido inverso, de extração de elementos. Ao final interação(
caso o bloco try não lance uma exception) uma nova estrutura de arvore é ge-
rada com os objetos resultantes do fluxo de dados.

• Classe FuncionarioPaciente
Esta classe tem o objetivo de cadastrar Funcionários como cliente para que seja
dado um desconto de 25% no valor da consulta como requisitado no trabalho, não
sendo necessário assim a duplicação de registros (mesmo registro para funcionário
e Paciente). Esta classe tem o objetivo de se estruturar as unidades de inserção da
arvore, definindo que aspectos todos os nós presentes na coleção de Arvore terão.
A classe FuncionarioPaciente extende a classe Paciente, É um Paciente, possuindo
uma composição da classe Funcionário como atributo private, garantindo assim que
esta classe seja um paciente com funcionalidades de funcionário, permitindo que, este
’Cliente’ manipule métodos como o cadastro de consulta passando como parâmetro
uma referência para o próprio objeto no lugar de um Paciente.
5No cadastro de Consulta, além de todos os dados necessários para o cadastro de
consulta feito por uma instancia da classe atendente, o parâmetro ValorConsulta é
multiplicado por (0.75) garantindo assim o desconto de 25% do valor de consulta
para qualquer Funcionário;

• Classes Funcionário e Paciente
Estas classes implementadas em trabalhos anteriores foram modificadas para esten-
der a classe Comparable, garantindo a presença do método compareTo necessário
para a manipulação de suas instancias em estruturas de arvore. No caso da classe
abstrata Funcionário, foi implementada o método compareTo e, em suas subclasses,
este mesmo método foi sobrescrito com a implementação SUPER.compareTo(obj funcionario),
garantindo que a mesma implementação da classe funcionário seja também seja cha-
mada por suas subclasses.

• Classe Consulta
A classe Consulta criada e documentada em trabalhos anteriores foi modificada
com o intuito de se usar o padrão de projeto Prototype que foi usado para uma
boa solução de geração de clones das instancias da classe, implementando além da
interface comparable a classe cloneable, indicando que a classe consulta é passı́vel
de ser clonada e garantindo a existência do método Clone().

• Class Sistema
A classe Sistema foi alterada com o objetivo de manipular as novas funcionalidades
adicionadas no sistema, instanciando as diferentes arvores (uma para cada tipo de
classe que estende Comparable). Foi também feito um cadastro de consulta feito por
um funcionário passando um referência à si mesmo como uma instância de Paciente
através da classe FuncionarioPaciente.
Através de um bloco try-catch, foi feito o uso da modificação na classe Consulta
que, através do uso do padrão de projeto Prototype implementado, usa a clonagem
de instâncias do tipo consulta. o catch tem como parâmetro CloneNotSupporte-
dException caso a clonagem não seja bem sucedida.
Foram implementados os métodos importElementos e gravarElementos para mani-
pulação em arquivos utilizando os vetores vetFuncionarios, vetPacientes e vetCon-
sultas que armazenam as instâncias de cada um destes tipos presente no sistema.
A chamada destas funções são realizadas dentro de um bloco try-catch-finally que
tem como clausula throws a exceção IOexception para garantir que caso o acesso ou
criação do arquivo não seja realizada com sucesso o programa não pare sua execução.

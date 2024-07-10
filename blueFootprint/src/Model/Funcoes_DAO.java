
package Model;

import javax.swing.JOptionPane;

public class Funcoes_DAO {
    public static int [] pontosResiduos = {0, 0}, pontosEmissoes = {0, 0}, pontosUsoRecursosMarinhos = {0, 0}, pontosPraticasSustentaveis = {0, 0};
    public static int contador = 0;
    public static double pesoResiduos = 0.3, pesoEmissoes = 0.3, pesoRecursos = 0.2, pesoSustentabilidade = 0.2;
    
    public static void sair() {
        String x = JOptionPane.showInputDialog(null, "Deseja mesmo encerrar o programa? O progresso pode ser perdido.\n1 - Sim\n\nDigite qualquer tecla para cancelar.");
        int op = Integer.parseInt(x);
        if(op==1){
        JOptionPane.showMessageDialog(null, "Programa encerrado");
        System.exit(0);
        }else{
        JOptionPane.showMessageDialog(null, "Voltando para o sistema...");
        }
    }

    public static void iniciar(){
        // Oculta os elementos da tela inicial
            View.Inicio_GUI.iniciar_btn.setVisible(false);
            View.Inicio_GUI.pressioneBotao_lbl.setVisible(false);
            View.Inicio_GUI.inicioQuiz_lbl.setVisible(false);
            View.Inicio_GUI.voltar_btn.setVisible(false);
            View.Inicio_GUI.pergunta1_lbl.setVisible(false);
            View.Inicio_GUI.pergunta2_lbl.setVisible(false);
            View.Inicio_GUI.resposta_cmb.setVisible(false);
            View.Inicio_GUI.proximo_btn.setVisible(false);
        // Exibe os elementos de descricao do quiz   
            View.Inicio_GUI.imagemDesc_lbl.setVisible(true);
            View.Inicio_GUI.vamosNessa_btn.setVisible(true);
        }


    public static void vamosNessa(){
        // Oculta os elementos da tela de descricao do quiz
            View.Inicio_GUI.imagemDesc_lbl.setVisible(false);
            View.Inicio_GUI.vamosNessa_btn.setVisible(false);

        // Define o texto do label "Pressione o botão" para a primeira etapa "Resíduos"
            View.Inicio_GUI.pressioneBotao_lbl.setText("Resíduos");
        // Exibe os elementos relacionados à primeira pergunta
            View.Inicio_GUI.pressioneBotao_lbl.setVisible(true);
            View.Inicio_GUI.pergunta1_lbl.setVisible(true);
            View.Inicio_GUI.pergunta2_lbl.setVisible(true);
            View.Inicio_GUI.resposta_cmb.setVisible(true);
            View.Inicio_GUI.proximo_btn.setVisible(true);
            View.Inicio_GUI.voltar_btn.setVisible(true);
            
        }

    
    
/**
     * Configura perguntas do quiz, definindo o texto das perguntas 
     * e adicionando as opções de resposta ao ComboBox.
     */
    public static void pergunta1(){
        
            View.Inicio_GUI.pressioneBotao_lbl.setText("Resíduos");
            // Define o texto da pergunta
            View.Inicio_GUI.pergunta1_lbl.setText("Qual é a quantidade de resíduos plásticos");
            View.Inicio_GUI.pergunta2_lbl.setText("gerada mensalmente pela empresa?");
            
            // Limpa as opções de resposta do ComboBox
            View.Inicio_GUI.resposta_cmb.removeAllItems();
            
            // Adiciona as opções de resposta ao ComboBox
            View.Inicio_GUI.resposta_cmb.addItem("Menos de 100 kg");
            View.Inicio_GUI.resposta_cmb.addItem("Entre 100 kg e 500 kg");
            View.Inicio_GUI.resposta_cmb.addItem("Entre 500 kg e 1000 kg");
            View.Inicio_GUI.resposta_cmb.addItem("Mais de 1000 kg");
            
    }
    
    public static void pergunta2(){
            // Define o texto do label "Pressione o botão" para a etapa da pergunta todas as vezes para evitar problemas ao pressionar "voltar"
            View.Inicio_GUI.pressioneBotao_lbl.setText("Resíduos");
            View.Inicio_GUI.pergunta1_lbl.setText("Como a empresa descarta seus");
            View.Inicio_GUI.pergunta2_lbl.setText("resíduos líquidos?");
            
            View.Inicio_GUI.resposta_cmb.removeAllItems();
            
            View.Inicio_GUI.resposta_cmb.addItem("Tratamento completo antes de descarte");
            View.Inicio_GUI.resposta_cmb.addItem("Tratamento parcial antes de descarte");
            View.Inicio_GUI.resposta_cmb.addItem("Descarte direto no oceano ou rios sem tratamento");
            
    }
    
    public static void pergunta3(){
        View.Inicio_GUI.pressioneBotao_lbl.setText("Emissões");
        View.Inicio_GUI.pergunta1_lbl.setText("A empresa utiliza produtos químicos");
        View.Inicio_GUI.pergunta2_lbl.setText("que podem acabar no oceano?");
            
        View.Inicio_GUI.resposta_cmb.removeAllItems();
            
        View.Inicio_GUI.resposta_cmb.addItem("Não");
        View.Inicio_GUI.resposta_cmb.addItem("Sim, mas com controle rigoroso");
        View.Inicio_GUI.resposta_cmb.addItem("Sim, sem controle adequado");
            
    }

    public static void pergunta4(){
        View.Inicio_GUI.pressioneBotao_lbl.setText("Emissões");
        View.Inicio_GUI.pergunta1_lbl.setText("A empresa monitora e controla");
        View.Inicio_GUI.pergunta2_lbl.setText("suas emissões atmosféricas?");
            
        View.Inicio_GUI.resposta_cmb.removeAllItems();
            
        View.Inicio_GUI.resposta_cmb.addItem("Sim, com relatórios regulares");
        View.Inicio_GUI.resposta_cmb.addItem("Parcialmente");
        View.Inicio_GUI.resposta_cmb.addItem("Não");
            
    }
    public static void pergunta5(){
        View.Inicio_GUI.pressioneBotao_lbl.setText("Recursos Marinhos");
        View.Inicio_GUI.pergunta1_lbl.setText("A empresa está envolvida na pesca?");
        View.Inicio_GUI.pergunta2_lbl.setText("");
            
        View.Inicio_GUI.resposta_cmb.removeAllItems();
            
        View.Inicio_GUI.resposta_cmb.addItem("Não");
        View.Inicio_GUI.resposta_cmb.addItem("Sim, com práticas sustentáveis");
        View.Inicio_GUI.resposta_cmb.addItem("Sim, sem práticas sustentáveis");
            
    }
    public static void pergunta6(){
        View.Inicio_GUI.pressioneBotao_lbl.setText("Recursos Marinhos");
        View.Inicio_GUI.pergunta1_lbl.setText("A empresa extrai minerais ou outros");
        View.Inicio_GUI.pergunta2_lbl.setText("recursos do mar?");
            
        View.Inicio_GUI.resposta_cmb.removeAllItems();
            
        View.Inicio_GUI.resposta_cmb.addItem("Não");
        View.Inicio_GUI.resposta_cmb.addItem("Sim, com práticas de minimização de impacto");
        View.Inicio_GUI.resposta_cmb.addItem("Sim, sem práticas de minimização de impacto");
            
    }
    
    public static void pergunta7(){
        View.Inicio_GUI.pressioneBotao_lbl.setText("Práticas Sustentáveis");
        View.Inicio_GUI.pergunta1_lbl.setText("A empresa tem políticas de sustentabilidade");
        View.Inicio_GUI.pergunta2_lbl.setText("e responsabilidade ambiental?");
            
        View.Inicio_GUI.resposta_cmb.removeAllItems();
            
        View.Inicio_GUI.resposta_cmb.addItem("Sim, completamente implementadas");
        View.Inicio_GUI.resposta_cmb.addItem("Sim, parcialmente implementadas");
        View.Inicio_GUI.resposta_cmb.addItem("Não");
            
    }
    
    public static void pergunta8(){
        View.Inicio_GUI.pressioneBotao_lbl.setVisible(true);
        View.Inicio_GUI.resposta_cmb.setVisible(true);
        View.Inicio_GUI.pergunta1_lbl.setVisible(true);
        View.Inicio_GUI.pergunta2_lbl.setVisible(true);
        View.Inicio_GUI.imagemFimQuiz_lbl.setVisible(false);
        
        View.Inicio_GUI.pressioneBotao_lbl.setText("Práticas Sustentáveis");
        View.Inicio_GUI.pergunta1_lbl.setText("A empresa participa de programas");
        View.Inicio_GUI.pergunta2_lbl.setText("de conservação marinha?");
            
        View.Inicio_GUI.resposta_cmb.removeAllItems();
            
        View.Inicio_GUI.resposta_cmb.addItem("Sim, ativamente");
        View.Inicio_GUI.resposta_cmb.addItem("Sim, ocasionalmente");
        View.Inicio_GUI.resposta_cmb.addItem("Não");
    }

    
/**
     * Processa a resposta da pergunta atual, atualiza o contador de perguntas, 
     * atribui pontos de acordo com a resposta e chama a próxima pergunta.
     */
    public static void proximo(){
        // Utiliza logica de contador para saber em qual pergunta esta.
        contador += 1;
        // Obtém a resposta selecionada pelo usuário
        String selecionado = View.Inicio_GUI.resposta_cmb.getSelectedItem().toString();
        // Utiliza um switch para processar a resposta de acordo com a pergunta atual
        switch (contador){
            case 1:
                if(selecionado == "Menos de 100 kg"){
                    pontosResiduos[0] = 1;
                    System.out.println("Resposta computada, valor: " + pontosResiduos[0]);
                }else if(selecionado == "Entre 100 kg e 500 kg"){
                    pontosResiduos[0] = 2;
                    System.out.println("Resposta computada, valor: " + pontosResiduos[0]);
                }else if(selecionado == "Entre 500 kg e 1000 kg"){
                    pontosResiduos[0] = 3;
                    System.out.println("Resposta computada, valor: " + pontosResiduos[0]);
                }else{
                    pontosResiduos[0] = 4;
                    System.out.println("Resposta computada, valor: " + pontosResiduos[0]);
                };
                pergunta2();
                break;
            case 2:
                if(selecionado == "Tratamento completo antes de descarte"){
                    pontosResiduos[1] = 1;
                    System.out.println("Resposta computada, valor: " + pontosResiduos[1]);
                }else if(selecionado == "Tratamento parcial antes de descarte"){
                    pontosResiduos[1] = 2;
                    System.out.println("Resposta computada, valor: " + pontosResiduos[1]);
                }else{
                    pontosResiduos[1] = 4;
                    System.out.println("Resposta computada, valor: " + pontosResiduos[1]);
                };
                pergunta3();
                break;
            case 3:
                if(selecionado == "Não"){
                    pontosEmissoes[0] = 1;
                    System.out.println("Resposta computada, valor: " + pontosEmissoes[0]);
                }else if(selecionado == "Sim, mas com controle rigoroso"){
                    pontosEmissoes[0] = 2;
                    System.out.println("Resposta computada, valor: " + pontosEmissoes[0]);
                }else{
                    pontosEmissoes[0] = 4;
                    System.out.println("Resposta computada, valor: " + pontosEmissoes[0]);
                };
                pergunta4();
                break;
            case 4:
                if(selecionado == "Sim, com relatórios regulares"){
                    pontosEmissoes[1] = 1;
                    System.out.println("Resposta computada, valor: " + pontosEmissoes[1]);
                }else if(selecionado == "Parcialmente"){
                    pontosEmissoes[1] = 2;
                    System.out.println("Resposta computada, valor: " + pontosEmissoes[1]);
                }else{
                    pontosEmissoes[1] = 4;
                    System.out.println("Resposta computada, valor: " + pontosEmissoes[1]);
                };
                pergunta5();
                break;
            case 5:
                if(selecionado == "Não"){
                    pontosUsoRecursosMarinhos[0] = 0;
                    System.out.println("Resposta computada, valor: " + pontosUsoRecursosMarinhos[0]);
                }else if(selecionado == "Sim, com práticas sustentáveis"){
                    pontosUsoRecursosMarinhos[0] = 2;
                    System.out.println("Resposta computada, valor: " + pontosUsoRecursosMarinhos[0]);
                }else{
                    pontosUsoRecursosMarinhos[0] = 4;
                    System.out.println("Resposta computada, valor: " + pontosUsoRecursosMarinhos[0]);
                };
                pergunta6();
                break;
            case 6:
                if(selecionado == "Não"){
                    pontosUsoRecursosMarinhos[1] = 0;
                    System.out.println("Resposta computada, valor: " + pontosUsoRecursosMarinhos[1]);
                }else if(selecionado == "Sim, com práticas de minimização de impacto"){
                    pontosUsoRecursosMarinhos[1] = 2;
                    System.out.println("Resposta computada, valor: " + pontosUsoRecursosMarinhos[1]);
                }else{
                    pontosUsoRecursosMarinhos[1] = 4;
                    System.out.println("Resposta computada, valor: " + pontosUsoRecursosMarinhos[1]);
                };
                pergunta7();
                break;
            case 7:
                if(selecionado == "Sim, completamente implementadas"){
                    pontosPraticasSustentaveis[0] = 1;
                    System.out.println("Resposta computada, valor: " + pontosPraticasSustentaveis[0]);
                }else if(selecionado == "Sim, parcialmente implementadas"){
                    pontosPraticasSustentaveis[0] = 2;
                    System.out.println("Resposta computada, valor: " + pontosPraticasSustentaveis[0]);
                }else{
                    pontosPraticasSustentaveis[0] = 4;
                    System.out.println("Resposta computada, valor: " + pontosPraticasSustentaveis[0]);
                };
                pergunta8();
                break;
            case 8:
                if(selecionado == "Sim, ativamente"){
                    pontosPraticasSustentaveis[1] = 1;
                    System.out.println("Resposta computada, valor: " + pontosPraticasSustentaveis[1]);
                }else if(selecionado == "Sim, ocasionalmente"){
                    pontosPraticasSustentaveis[1] = 2;
                    System.out.println("Resposta computada, valor: " + pontosPraticasSustentaveis[1]);
                }else{
                    pontosPraticasSustentaveis[1] = 4;
                    System.out.println("Resposta computada, valor: " + pontosPraticasSustentaveis[1]);
                };
                // Chama a função para exibir a tela final do quiz
                telaFimQuiz();
                break;
            case 9:
                // Chama a função para calcular o resultado do quiz
                calculo();
                break;
            case 10:
                // Chama a função para exibir mais detalhes sobre o resultado
                maisDetalhes();
                break;
                
        }
    }

/**
     * Retorna para a pergunta anterior do quiz, decrementando o contador de 
     * perguntas e configurando a pergunta correspondente. Se estiver na primeira 
     * pergunta, retorna para a tela inicial.
     */
    public static void voltar(){
        switch (contador){
            case 1:
                contador -= 1;
                pergunta1();
                break;
            case 2:
                contador -= 1;
                pergunta2();
                break;
            case 3:
                contador -= 1;
                pergunta3();
                break;
            case 4:
                contador -= 1;
                pergunta4();
                break;
            case 5:
                contador -= 1;
                pergunta5();
                break;
            case 6:
                contador -= 1;
                pergunta6();
                break;
            case 7:
                contador -= 1;
                pergunta7();
                break;
            case 8:
                contador -= 1;
                pergunta8();
                break;
            default:
                iniciar();
                break;
        }
    }

    
/**
     * Calcula o impacto ambiental total da empresa com base nas respostas do 
     * quiz, normaliza as pontuações de cada categoria, aplica os pesos 
     * correspondentes e exibe o resultado na interface gráfica.
     */
    public static void calculo(){
            View.Inicio_GUI.proximo_btn.setText("MAIS DETALHES");
            View.Inicio_GUI.voltar_btn.setVisible(false);
            
            // Calcula a pontuação total por categoria
            int totalResiduos = pontosResiduos[0] + pontosResiduos[1];
            int totalEmissoes = pontosEmissoes[0] + pontosEmissoes[1];
            int totalRecursosMarinhos = pontosUsoRecursosMarinhos[0] + pontosUsoRecursosMarinhos[1];
            int totalPraticasSustentaveis = pontosPraticasSustentaveis[0] + pontosPraticasSustentaveis[1];
            
            // Normaliza a pontuação de cada categoria para uma escala de 0 a 10
            double normalizadoResiduos = (double) totalResiduos / 8 * 10; // 8 pontos possíveis na categoria Resíduos
            double normalizadoEmissoes = (double) totalEmissoes / 8 * 10; // 8 pontos possíveis na categoria Emissões
            double normalizadoUsoRecursosMarinhos = (double) totalRecursosMarinhos / 8 * 10; // 8 pontos possíveis na categoria Recursos Marinhos
            double normalizadoPraticasSustentaveis = (double) totalPraticasSustentaveis / 8 * 10; // 8 pontos possíveis na categoria Práticas Sustentáveis

            // Calcula o impacto total ponderado, aplicando os pesos de cada categoria
            double impactoTotal = (normalizadoResiduos * pesoResiduos) + (normalizadoEmissoes * pesoEmissoes) + (normalizadoUsoRecursosMarinhos * pesoRecursos) + (normalizadoPraticasSustentaveis * pesoSustentabilidade);
        
            
            // Imprime os valores calculados no console para fins de depuração
            System.out.println("------------------pontosResiduos--------------------");
            System.out.println(pontosResiduos[0]);
            System.out.println(pontosResiduos[1]);
            System.out.println("-----------------pontosEmissoes--------------------");
            System.out.println(pontosEmissoes[0]);
            System.out.println(pontosEmissoes[1]);
            System.out.println("-----------------pontosUsoRecursosMarinhos---------------------");
            System.out.println(pontosUsoRecursosMarinhos[0]);
            System.out.println(pontosUsoRecursosMarinhos[1]);
            System.out.println("------------------pontosPraticasSustentaveis--------------------");
            System.out.println(pontosPraticasSustentaveis[0]);
            System.out.println(pontosPraticasSustentaveis[1]);
        
            System.out.println("------------------normalizadoResiduos--------------------");
            System.out.println(normalizadoResiduos);
            System.out.println("------------------normalizadoEmissoes--------------------");
            System.out.println(normalizadoEmissoes);
            System.out.println("------------------normalizadoUsoRecursosMarinhos--------------------");
            System.out.println(normalizadoUsoRecursosMarinhos);
            System.out.println("------------------normalizadoPraticasSustentaveis--------------------");
            System.out.println(normalizadoPraticasSustentaveis);

            System.out.println("-----------------impactoTotal---------------------");
            System.out.println(impactoTotal);
            
            // Arredonda o impacto total para o inteiro mais próximo
            long impactoTotalArredondado = Math.round(impactoTotal);
            System.out.println(impactoTotalArredondado);

            // Exibe o impacto total arredondado na interface gráfica
            View.Inicio_GUI.pegada_lbl.setText(String.valueOf(impactoTotalArredondado));
            
        // Exibe a imagem correspondente ao impacto total na interface gráfica
        if (impactoTotalArredondado>=0 && impactoTotalArredondado <= 2){
            View.Inicio_GUI.imagemBaixoImpacto_lbl.setVisible(true);
            View.Inicio_GUI.pegada_lbl.setVisible(true);
        }else if(impactoTotalArredondado>=3 && impactoTotalArredondado <= 4){
            View.Inicio_GUI.imagemImpactoModerado_lbl.setVisible(true);
            View.Inicio_GUI.pegada_lbl.setVisible(true);
        }else if(impactoTotalArredondado>=5 && impactoTotalArredondado <= 7){
            View.Inicio_GUI.imagemAltoImpacto_lbl.setVisible(true);
            View.Inicio_GUI.pegada_lbl.setVisible(true);
        }else if(impactoTotalArredondado>=8 && impactoTotalArredondado <= 10){
            View.Inicio_GUI.imagemAltissimoImpacto_lbl.setVisible(true);
            View.Inicio_GUI.pegada_lbl.setVisible(true);
        }
    }
    
/**
     * Exibe a tela final do quiz (antes do resultado), ocultando os elementos relacionados às 
     * perguntas e respostas e exibindo a imagem de fim de quiz.
     */
    public static void telaFimQuiz(){
            View.Inicio_GUI.iniciar_btn.setVisible(false);
            View.Inicio_GUI.pressioneBotao_lbl.setVisible(false);
            View.Inicio_GUI.inicioQuiz_lbl.setVisible(false);
            View.Inicio_GUI.pergunta1_lbl.setVisible(false);
            View.Inicio_GUI.pergunta2_lbl.setVisible(false);
            View.Inicio_GUI.resposta_cmb.setVisible(false);

            View.Inicio_GUI.imagemFimQuiz_lbl.setVisible(true);
    }

/**
     * Exibe uma caixa de diálogo com informações detalhadas sobre os pesos 
     * de cada categoria e a pontuação obtida em cada categoria. 
     * Decrementa o contador de perguntas para permitir que o usuário 
     * visualize a tela de resultados novamente.
     */
    public static void maisDetalhes(){
        // Cria uma caixa de diálogo com as informações detalhadas
        JOptionPane.showMessageDialog(null, "----Pesos de cada categoria:----\n" +
            "Resíduos: 30%\n" +
            "Emissões: 30%\n" +
            "Uso de Recursos Marinhos: 20%\n" +
            "Práticas Sustentáveis: 20%\n" +
            "----Pontuação por categoria (máximo 8):----\n" +
            "Pontos Resíduos: " + (pontosResiduos[0] + pontosResiduos[1]) + "\n" +
            "Pontos Emissões: " + (pontosEmissoes[0] + pontosEmissoes[1]) + "\n" +
            "Pontos Recursos Marinhos: " + (pontosUsoRecursosMarinhos[0] + pontosUsoRecursosMarinhos[1]) + "\n" +
            "Pontos Práticas Sustentáveis: " + (pontosPraticasSustentaveis[0] + pontosPraticasSustentaveis[1]));
        
        contador -= 1;
    }

}



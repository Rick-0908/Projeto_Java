package Atividades_Listas_Senai.Praticas.Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pratica_Projeto01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Equipamento = {"Capacete - 1", "Luvas - 2", "Botas - 3", "Cinto - 4"};
        List<String> listaEquipamento = new ArrayList<>(Arrays.asList(Equipamento));
        String[] Roupas = {"Blusa - 1", "Calça - 2", "Cueca - 3", "Moletom - 4"};
        List<String> listaRoupas = new ArrayList<>(Arrays.asList(Roupas));
        String[] Ferramentas = {"martelo - 1", "Chave de Fenda - 2", "Chave Phillips - 3", "Compressor - 4"};
        List<String> listaFerramentas = new ArrayList<>(Arrays.asList(Ferramentas));
        String[] Perifericos = {"Fone de Ouvido - 1", "Mouse - 2", "Teclado - 3", "Monitor - 4"};
        List<String> listaPerifericos = new ArrayList<>(Arrays.asList(Perifericos));
        String[] Pagamento = {"Cartão de Crédito", "Cartão de Debito", "Pix", "Boleto"};
        List<String> listaPagamento = new ArrayList<>(Arrays.asList(Pagamento));
        List<String> carrinho = new ArrayList<>();
        String[] PrecoE = {"| R$ 129,99", "| R$ 30,00", "| R$ 60,00", "| R$| 34,54"};
        List<String> listaPrecoE = new ArrayList<>(Arrays.asList(PrecoE));
        String[] PrecoR = {"| R$ 129,99", "| R$ 30,00", "| R$ 60,00", " R$| 34,54"};
        List<String> listaPrecoR = new ArrayList<>(Arrays.asList(PrecoR));
        String[] PrecoF = {"| R$ 129,99", "| R$ 30,00", "| R$ 60,00", " R$| 34,54"};
        List<String> listaPrecoF = new ArrayList<>(Arrays.asList(PrecoF));
        String[] PrecoP = {"| R$ 129,99", "| R$ 30,00", "| R$ 60,00", " R$| 34,54"};
        List<String> listaPrecoP = new ArrayList<>(Arrays.asList(PrecoP));
        System.out.println("==================================================");
        System.out.println("Boas Vindas ao sistema de Compra");
        System.out.println("==================================================");
        System.out.println("==================================================");
        System.out.println("Deseja comprar qual dos itens abaixo ?");
        System.out.println("1 - Equipamentos");
        System.out.println("2 - Roupas");
        System.out.println("3 - Ferramentas");
        System.out.println("4 - Perifericos");
        System.out.println("==================================================");
        int opcao = sc.nextInt();
        do {
            if (opcao == 1) {
                System.out.println("==================================================");
                System.out.println("Digite o produto desejado 1 de cada vez");
                System.out.println("==================================================");
                System.out.println(Equipamento[0] + PrecoE[0]);
                System.out.println(Equipamento[1] + PrecoE[1]);
                System.out.println(Equipamento[2] + PrecoE[2]);
                System.out.println(Equipamento[3] + PrecoE[3]);
                System.out.println("==================================================");
                String opcaoR = sc.next();
                if (opcaoR.equals("1") || opcaoR.equals("2") || opcaoR.equals("3") || opcaoR.equals("4")) {
                    if (opcaoR.equals("1")) {
                        listaEquipamento.remove(Equipamento[0]);
                        carrinho.add(PrecoR[0]);
                        carrinho.add(Equipamento[0]);
                        System.out.println("==================================================");
                        System.out.println("Otima escolha !!! Sua escolha foi: " + Equipamento[0] + PrecoR[0]);
                        System.out.println("==================================================");
                        System.out.println("==================================================");
                        System.out.println("Deseja adicionar mais algum produto ? ");
                        System.out.println("==================================================");
                        sc.nextLine();
                        String novoProduto = sc.nextLine();
                        if (novoProduto.equalsIgnoreCase("sim")) {
                            System.out.println("==================================================");
                            System.out.println("Qual produto deseja adicionar ? " + listaEquipamento);
                            System.out.println("==================================================");
                            String novoProduto1 = sc.nextLine();
                            if (novoProduto1.equals("2")) {
                                listaEquipamento.remove(Equipamento[1]);
                                carrinho.add(PrecoR[1]);
                                carrinho.add(Equipamento[1]);
                                System.out.println("==================================================");
                                System.out.println("Otimo produto adicionado !!!");
                                System.out.println("Seu carrinho ficou: " + carrinho);
                                System.out.println("Deseja adicionar mais algum produto ? ");
                                System.out.println("==================================================");
                                String novoProduto2 = sc.nextLine();
                                if (novoProduto2.equalsIgnoreCase("sim")) {
                                    System.out.println("==================================================");
                                    System.out.println("Qual produto deseja adicionar ? " + listaEquipamento);
                                    System.out.println("==================================================");
                                    String novoProduto3 = sc.nextLine();
                                    if (novoProduto3.equals("3")) {
                                        listaEquipamento.remove(Equipamento[2]);
                                        carrinho.add(Equipamento[2]);
                                        carrinho.add(PrecoE[2]);
                                        System.out.println("==================================================");
                                        System.out.println("Otimo produto adicionado !!!");
                                        System.out.println("Seu carrinho ficou: " + carrinho);
                                        System.out.println("Deseja adicionar mais algum produto ?");
                                        System.out.println("==================================================");
                                        String novoProduto4 = sc.nextLine();
                                        if (novoProduto4.equalsIgnoreCase("sim")) {
                                            System.out.println("==================================================");
                                            System.out.println("Qual produto deseja adicionar ? " + listaEquipamento);
                                            System.out.println("==================================================");
                                            String novoProduto5 = sc.nextLine();
                                            if (novoProduto5.equals("4")) {
                                                listaEquipamento.remove(Equipamento[3]);
                                                carrinho.add(Equipamento[3]);
                                                carrinho.add(PrecoE[3]);
                                                System.out.println("==================================================");
                                                System.out.println("Otimo produto adicionado !!!");
                                                System.out.println("Não temos mais produtos para adicionar");
                                                System.out.println("Seu carrinho ficou: " + carrinho);
                                                System.out.println("==================================================");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (opcao == 2) {
                System.out.println("==================================================");
                System.out.println("Digite o produto desejado 1 de cada vez");
                System.out.println(Roupas[0]);
                System.out.println(Roupas[1]);
                System.out.println(Roupas[2]);
                System.out.println(Roupas[3]);
                System.out.println("==================================================");
                String opcaoR2 = sc.next();

                if (opcaoR2.equals("1") || opcaoR2.equals("2") || opcaoR2.equals("3") || opcaoR2.equals("4")) {
                    if (opcaoR2.equals("1")) {
                        System.out.println("===================================================");
                        System.out.println("Otima escolha !!! Sua escolha foi: " + Roupas[0]);
                        System.out.println("===================================================");
                        listaRoupas.remove(Roupas[0]);
                        carrinho.add(Roupas[0]);
                        System.out.println("Seu carrinho ficou: " + carrinho);
                        System.out.println("===================================================");
                        System.out.println("Deseja adicionar alguma produto? ");
                        System.out.println("===================================================");

                        // CORREÇÃO: Adicionar esta linha para limpar o buffer
                        sc.nextLine();
                        String novoRoupa = sc.nextLine();

                        if (novoRoupa.equalsIgnoreCase("sim")) {
                            System.out.println("Qual produto deseja adicionar ? " + listaRoupas);
                            String novoRoupa1 = sc.nextLine();

                            if (novoRoupa1.equals("2")) {
                                listaRoupas.remove(Roupas[1]);
                                carrinho.add(Roupas[1]);
                                System.out.println("===================================================");
                                System.out.println("Otima escolha !!! Sua escolha foi: " + Roupas[1]);
                                System.out.println("Deseja adicionar mais alguma produto ? ");
                                System.out.println("===================================================");
                                String novoRoupa2 = sc.nextLine();

                                if (novoRoupa2.equalsIgnoreCase("sim")) {
                                    System.out.println("===================================================");
                                    System.out.println("Qual produto deseja adicionar ? " + listaRoupas);
                                    System.out.println("===================================================");
                                    String novoRoupa3 = sc.nextLine();

                                    if (novoRoupa3.equals("3")) {
                                        listaRoupas.remove(Roupas[2]);
                                        carrinho.add(Roupas[2]);
                                        System.out.println("===================================================");
                                        System.out.println("Otimo produto adicionado !!!");
                                        System.out.println("Seu carrinho ficou " + carrinho);
                                        System.out.println("Deseja comprar outro produto ?");
                                        System.out.println("===================================================");
                                        String novoRoupa4 = sc.nextLine();

                                        if (novoRoupa4.equalsIgnoreCase("sim")) {
                                            System.out.println("===================================================");
                                            System.out.println("Qual produto deseja adicionar ? " + listaRoupas);
                                            System.out.println("===================================================");
                                            String novoRoupa5 = sc.nextLine();

                                            if (novoRoupa5.equals("4")) {
                                                listaRoupas.remove(Roupas[3]);
                                                carrinho.add(Roupas[3]);
                                                System.out.println("===================================================");
                                                System.out.println("Otima escolha !!!");
                                                System.out.println("Seu produto adicionado foi " + listaRoupas);
                                                System.out.println("Seu carrinho ficou assim: " + carrinho);
                                                System.out.println("Não temos mais produto para ser adicionado");
                                                System.out.println("Prosseguindo para o proximo passo");
                                                System.out.println("===================================================");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (opcao == 3) {
                System.out.println("==================================================");
                System.out.println("Digite o produto desejado 1 de cada vez");
                System.out.println("==================================================");
                System.out.println(Ferramentas[0]);
                System.out.println(Ferramentas[1]);
                System.out.println(Ferramentas[2]);
                System.out.println(Ferramentas[3]);
                System.out.println("==================================================");
                String opcao1 = sc.next();

                if (opcao1.equals("1") || opcao1.equals("2") || opcao1.equals("3") || opcao1.equals("4")) {
                    if (opcao1.equals("1")) {
                        listaFerramentas.remove(Ferramentas[0]);
                        carrinho.add(Ferramentas[0]);
                        System.out.println("==================================================");
                        System.out.println("Otima escolha !!! Sua escolha foi: " + Ferramentas[0]);
                        System.out.println("==================================================");
                        System.out.println("==================================================");
                        System.out.println("Deseja adicionar mais algum produto ? ");
                        System.out.println("==================================================");
                        sc.nextLine();
                        String novoProduto01 = sc.nextLine();

                        if (novoProduto01.equalsIgnoreCase("sim")) {
                            System.out.println("==================================================");
                            System.out.println("Qual produto deseja adicionar ? " + listaFerramentas);
                            System.out.println("==================================================");
                            String novoProduto02 = sc.nextLine();

                            if (novoProduto02.equals("2")) {
                                listaFerramentas.remove(Ferramentas[1]);
                                carrinho.add(Ferramentas[1]);
                                System.out.println("==================================================");
                                System.out.println("Otimo produto adicionado !!!");
                                System.out.println("Seu carrinho ficou: " + carrinho);
                                System.out.println("Deseja adicionar mais algum produto ? ");
                                System.out.println("==================================================");
                                String novoProduto03 = sc.nextLine();

                                if (novoProduto03.equalsIgnoreCase("sim")) {
                                    System.out.println("==================================================");
                                    System.out.println("Qual produto deseja adicionar ? " + listaFerramentas);
                                    System.out.println("==================================================");
                                    String novoProduto04 = sc.nextLine();

                                    if (novoProduto04.equals("3")) {
                                        listaFerramentas.remove(Ferramentas[2]);
                                        carrinho.add(Ferramentas[2]);
                                        System.out.println("==================================================");
                                        System.out.println("Otimo produto adicionado !!!");
                                        System.out.println("Seu carrinho ficou: " + carrinho);
                                        System.out.println("Deseja adicionar mais algum produto ?");
                                        System.out.println("==================================================");
                                        String novoProduto05 = sc.nextLine();

                                        if (novoProduto05.equalsIgnoreCase("sim")) {
                                            System.out.println("==================================================");
                                            System.out.println("Qual produto deseja adicionar ? " + listaFerramentas);
                                            System.out.println("==================================================");
                                            String novoProduto06 = sc.nextLine();

                                            if (novoProduto06.equals("4")) {
                                                listaFerramentas.remove(Ferramentas[3]);
                                                carrinho.add(Ferramentas[3]);
                                                System.out.println("==================================================");
                                                System.out.println("Otimo produto adicionado !!!");
                                                System.out.println("Não temos mais produtos para adicionar");
                                                System.out.println("Seu carrinho ficou: " + carrinho);
                                                System.out.println("==================================================");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (opcao == 4) {
                System.out.println("==================================================");
                System.out.println("Digite o produto desejado 1 de cada vez");
                System.out.println("==================================================");
                System.out.println(Perifericos[0]);
                System.out.println(Perifericos[1]);
                System.out.println(Perifericos[2]);
                System.out.println(Perifericos[3]);
                System.out.println("==================================================");
                String opcao2 = sc.next();

                if (opcao2.equals("1") || opcao2.equals("2") || opcao2.equals("3") || opcao2.equals("4")) {
                    if (opcao2.equals("1")) {
                        listaPerifericos.remove(Perifericos[0]);
                        carrinho.add(Perifericos[0]);
                        System.out.println("==================================================");
                        System.out.println("Otima escolha !!! Sua escolha foi: " + Perifericos[0]);
                        System.out.println("==================================================");
                        System.out.println("==================================================");
                        System.out.println("Deseja adicionar mais algum produto ? ");
                        System.out.println("==================================================");
                        sc.nextLine();
                        String novoProduto001 = sc.nextLine();

                        if (novoProduto001.equalsIgnoreCase("sim")) {
                            System.out.println("==================================================");
                            System.out.println("Qual produto deseja adicionar ? " + listaPerifericos);
                            System.out.println("==================================================");
                            String novoProduto002 = sc.nextLine();

                            if (novoProduto002.equals("2")) {
                                listaPerifericos.remove(Perifericos[1]);
                                carrinho.add(Perifericos[1]);
                                System.out.println("==================================================");
                                System.out.println("Otimo produto adicionado !!!");
                                System.out.println("Seu carrinho ficou: " + carrinho);
                                System.out.println("Deseja adicionar mais algum produto ? ");
                                System.out.println("==================================================");
                                String novoProduto003 = sc.nextLine();

                                if (novoProduto003.equalsIgnoreCase("sim")) {
                                    System.out.println("==================================================");
                                    System.out.println("Qual produto deseja adicionar ? " + listaPerifericos);
                                    System.out.println("==================================================");
                                    String novoProduto004 = sc.nextLine();

                                    if (novoProduto004.equals("3")) {
                                        listaPerifericos.remove(Perifericos[2]);
                                        carrinho.add(Perifericos[2]);
                                        System.out.println("==================================================");
                                        System.out.println("Otimo produto adicionado !!!");
                                        System.out.println("Seu carrinho ficou: " + carrinho);
                                        System.out.println("Deseja adicionar mais algum produto ?");
                                        System.out.println("==================================================");
                                        String novoProduto005 = sc.nextLine();

                                        if (novoProduto005.equalsIgnoreCase("sim")) {
                                            System.out.println("==================================================");
                                            System.out.println("Qual produto deseja adicionar ? " + listaPerifericos);
                                            System.out.println("==================================================");
                                            String novoProduto006 = sc.nextLine();

                                            if (novoProduto006.equals("4")) {
                                                listaPerifericos.remove(Perifericos[3]);
                                                carrinho.add(Perifericos[3]);
                                                System.out.println("==================================================");
                                                System.out.println("Otimo produto adicionado !!!");
                                                System.out.println("Não temos mais produtos para adicionar");
                                                System.out.println("Seu carrinho ficou: " + carrinho);
                                                System.out.println("==================================================");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("==================================================");
            System.out.println("Deseja cancelar alguma operação ?");
            System.out.println("==================================================");
            String texto1 = sc.nextLine();

            if (texto1.equals("sim")) {
                System.out.println("==================================================");
                System.out.println("Qual operação deseja encerrar  ?");
                System.out.println("==================================================");
                System.out.println(Equipamento[0]);
                System.out.println(Equipamento[1]);
                System.out.println(Equipamento[2]);
                System.out.println(Equipamento[3]);
                System.out.println("5 - Menu");

                String opcaoCancelar = sc.nextLine();

                if (opcaoCancelar.equals("1") || opcaoCancelar.equals("2") || opcaoCancelar.equals("3") || opcaoCancelar.equals("4")) {
                    if (opcaoCancelar.equals("1")) {
                        System.out.println("==================================================");
                        System.out.println("Operação encerrada com sucesso");
                        System.out.println("==================================================");
                        sc.close();
                        System.exit(0);
                    }
                    if (opcaoCancelar.equals("2")) {
                        System.out.println("==================================================");
                        System.out.println("Operação encerrada com sucesso");
                        System.out.println("==================================================");
                        sc.close();
                        System.exit(0);
                    }
                    if (opcaoCancelar.equals("3")) {
                        System.out.println("==================================================");
                        System.out.println("Operação encerrada com sucesso");
                        System.out.println("==================================================");
                        sc.close();
                        System.exit(0);
                    }
                    if (opcaoCancelar.equals("4")) {
                        System.out.println("==================================================");
                        System.out.println("Operação encerrada com sucesso");
                        System.out.println("==================================================");
                        sc.close();
                        System.exit(0);
                    }
                    if (opcaoCancelar.equals("5")) {
                        System.out.println("==================================================");
                        System.out.println("Voltando ao menu");
                        System.out.println("==================================================");
                        return;
                    }
                }
            }

            System.out.println("==================================================");
            System.out.println("Prosseguindo para o pagamento");
            System.out.println("Como Deseja fazer o pagamento ?");
            System.out.println("==================================================");
            System.out.println(listaPagamento);
            String opcaoP = sc.next();

            if (opcaoP.equals("1") || opcaoP.equals("2") || opcaoP.equals("3") || opcaoP.equals("4")) {
                if (opcaoP.equals("1")) {
                    System.out.println("==================================================");
                    System.out.println("Cartão de Credito selecionado, Verifique o APP do seu bando !!!");
                    System.out.println("==================================================");
                }
                if (opcaoP.equals("2")) {
                    System.out.println("==================================================");
                    System.out.println("Cartão de Debidto selecionado, Verifique o APP do seu bando !!!");
                    System.out.println("==================================================");
                }
                if (opcaoP.equals("3")) {
                    System.out.println("==================================================");
                    System.out.println("Metodo de pagamento PIX selecionado  (QR CODE APARECE AQUI)");
                    System.out.println("==================================================");
                }
                if (opcaoP.equals("4")) {
                    System.out.println("==================================================");
                    System.out.println("Um boleto foi gerado com sucesso verifique seu email !!!");
                    System.out.println("==================================================");
                }
            } else
                System.out.println("Digite uma das opções validas");
        }while (opcao != 4);
    }
}
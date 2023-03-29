package br.com.newton.alugueldecarros;
import javax.swing.*;
public class AlugueldeVeículos
{
    public static void main(String[] args)
    {
        JFrame janela = new JFrame("Aluguel de Automóveis");
        JPanel painel = new JPanel();
        janela.setSize(500, 600);
        janela.setVisible(true);

        JLabel labelNome = new JLabel("Nome :");
        JLabel labelCpf = new JLabel("CPF :");
        JLabel labelTel = new JLabel("Telefone :");
        JLabel labelNomeCarro = new JLabel("Nome do carro :");
        JLabel labelPlaca = new JLabel("Número da placa :");
        JLabel labelAno = new JLabel("Ano de Produção do carro :");
        JLabel labelDtaLocal = new JLabel("Data de Localização");
        JLabel labelEntrega = new JLabel("Data da Entrega");

        labelNome.setBounds(50,40, 100, 20);
        labelCpf.setBounds(50,80,100,20);
        labelTel.setBounds(50,120,100,20);
        labelNomeCarro.setBounds(50,160,100,20);
        labelPlaca.setBounds(50,200,100,20);
        labelAno.setBounds(50,240,100,20);
        labelDtaLocal.setBounds(50,280,100,20);
        labelEntrega.setBounds(50,320,100,20);

        painel.add(labelNome);
        painel.add(labelCpf);
        painel.add(labelTel);
        painel.add(labelNomeCarro);
        painel.add(labelPlaca);
        painel.add(labelAno);
        painel.add(labelDtaLocal);
        painel.add(labelEntrega);

        janela.getContentPane().add(painel);

    }
}

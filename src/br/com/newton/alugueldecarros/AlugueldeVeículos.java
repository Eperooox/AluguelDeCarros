package br.com.newton.alugueldecarros;
import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class AlugueldeVeículos implements ActionListener
{
    private JButton botao;
    public void janela2()
    {
        botao.addActionListener(this);
    }
    public static void main(String[] args)
    {

        JFrame janela = new JFrame("Aluguel de Carros");
        JButton botao = new JButton("Salvar");
        janela.setSize(500, 600);
        janela.setVisible(true);

        JPanel painel = new JPanel();
        janela.getContentPane().add(painel);
        janela.getContentPane().add(botao);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel dadosCliente = new JLabel("Dados do cliente: ");
        JLabel labelNome = new JLabel("Nome :");
        JLabel labelCpf = new JLabel("CPF :");
        JLabel labelTel = new JLabel("Telefone :");
        JLabel labelNomeCarro = new JLabel("Nome do carro:");
        JLabel labelPlaca = new JLabel("Placa :");
        JLabel labelAno = new JLabel("Ano do carro :");
        JLabel labelDtaLocal = new JLabel("Data de Localização");
        JLabel labelEntrega = new JLabel("Data da Entrega");

        //Posição
        dadosCliente.setBounds(10, 30, 120, 40);
        labelNome.setBounds(35, 60, 100,40);
        labelCpf.setBounds(40, 80, 100,40);
        labelTel.setBounds(45, 100, 100,40);
        labelNomeCarro.setBounds(40, 160,100,40);
        labelPlaca.setBounds(45,180,100,40);
        labelAno.setBounds(50,200,100,40);
        labelDtaLocal.setBounds(55,220,150,40);
        labelEntrega.setBounds(60,240,100,40);

        painel.add(dadosCliente);
        painel.add(labelNome);
        painel.add(labelCpf);
        painel.add(labelTel);
        painel.add(labelNomeCarro);
        painel.add(labelPlaca);
        painel.add(labelAno);
        painel.add(labelDtaLocal);
        painel.add(labelEntrega);

        //Mascaras
        MaskFormatter mascaraCpf = null;
        MaskFormatter mascaraTel = null;
        MaskFormatter mascaraPlaca = null;
        MaskFormatter mascaraAno = null;
        MaskFormatter mascaraLoc = null;
        MaskFormatter mascaraEnt = null;

        try
        {
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraTel = new MaskFormatter("##-########");
            mascaraPlaca = new MaskFormatter("#######");
            mascaraAno = new MaskFormatter("####");
            mascaraLoc = new MaskFormatter("##-##-####");
            mascaraEnt = new MaskFormatter("##-##-####");

            mascaraEnt.setPlaceholderCharacter('_');
            mascaraCpf.setPlaceholderCharacter('_');
            mascaraTel.setPlaceholderCharacter('_');
            mascaraPlaca.setPlaceholderCharacter('_');
            mascaraAno.setPlaceholderCharacter('_');
            mascaraLoc.setPlaceholderCharacter('_');
        }
        catch (ParseException excp)
        {
            System.err.println("Erro na formatação: " + excp.getErrorOffset());
            System.exit(-1);
        }
        JFormattedTextField JFormatedTextCpf = new JFormattedTextField(mascaraCpf);
        JFormattedTextField JFormatedTextTel = new JFormattedTextField(mascaraTel);
        JFormattedTextField JFormatedTextPlaca = new JFormattedTextField(mascaraPlaca);
        JFormattedTextField JFormatedTextAno = new JFormattedTextField(mascaraAno);
        JFormattedTextField JFormatedTextLoc = new JFormattedTextField(mascaraLoc);
        JFormattedTextField JFormatedTextEnt = new JFormattedTextField(mascaraEnt);
        JFormatedTextCpf.setBounds(135,80,100,40);
        JFormatedTextTel.setBounds(140,100,100,40);
        JFormatedTextPlaca.setBounds(140,180,100,40);
        JFormatedTextAno.setBounds(145,200,100,40);
        JFormatedTextLoc.setBounds(150,220,100,40);
        JFormatedTextEnt.setBounds(155,240,100,40);

        painel.add(dadosCliente);
        painel.add(labelNome);
        painel.add(labelCpf);
        painel.add(labelTel);
        painel.add(labelNomeCarro);
        painel.add(labelPlaca);
        painel.add(labelPlaca);
        painel.add(labelAno);
        painel.add(labelDtaLocal);
        painel.add(labelEntrega);
        painel.add(JFormatedTextCpf);
        painel.add(JFormatedTextTel);
        painel.add(JFormatedTextPlaca);
        painel.add(JFormatedTextAno);
        painel.add(JFormatedTextLoc);
        painel.add(JFormatedTextEnt);
        janela.add(botao);
        botao.setBounds(200,300,150,80);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

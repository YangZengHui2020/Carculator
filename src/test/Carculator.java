package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Stack;

public class Carculator implements ActionListener {
	JFrame jf = new JFrame("���׼�����");// ���ݴ���
	JTextField text = new JTextField(" ");
	JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;// ���ְ�ť
	JButton buttonAdd, buttonSub, buttonMul, buttonDiv, buttonLK, butttonRK, butttonOrg, buttonEqu, buttonC, buttonBack;// ���Ű�ť
	String input = "";

	Carculator() {
		text.setEditable(false);
		text.setFont(new Font("����", Font.PLAIN, 18));
		setButton();
		setThis();
		addBut();
	}

	private void setThis() {
		// ���ڴ�С
		jf.setSize(500, 335);
		// ����λ�þ���
		jf.setLocationRelativeTo(null);
		// �رմ��ڽ�����������
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ڴ�С���ɱ�
		jf.setResizable(false);
		// ���ڿɼ�
		jf.setVisible(true);
	}

	// ���ð�ť�����С
	private void setButton() {
		button0 = new JButton("0");
		button0.setFont(new Font("����", Font.BOLD, 18));

		button1 = new JButton("1");
		button1.setFont(new Font("����", Font.BOLD, 18));

		button2 = new JButton("2");
		button2.setFont(new Font("����", Font.BOLD, 18));

		button3 = new JButton("3");
		button3.setFont(new Font("����", Font.BOLD, 18));

		button4 = new JButton("4");
		button4.setFont(new Font("����", Font.BOLD, 18));

		button5 = new JButton("5");
		button5.setFont(new Font("����", Font.BOLD, 18));
		button6 = new JButton("6");
		button6.setFont(new Font("����", Font.BOLD, 18));

		button7 = new JButton("7");
		button7.setFont(new Font("����", Font.BOLD, 18));

		button8 = new JButton("8");
		button8.setFont(new Font("����", Font.BOLD, 18));

		button9 = new JButton("9");
		button9.setFont(new Font("����", Font.BOLD, 18));

		buttonAdd = new JButton("+");
		buttonAdd.setFont(new Font("����", Font.BOLD, 18));

		buttonSub = new JButton("-");
		buttonSub.setFont(new Font("����", Font.BOLD, 18));

		buttonMul = new JButton("*");
		buttonMul.setFont(new Font("����", Font.BOLD, 18));

		buttonDiv = new JButton("/");
		buttonDiv.setFont(new Font("����", Font.BOLD, 18));

		buttonLK = new JButton("(");
		buttonLK.setFont(new Font("����", Font.BOLD, 18));

		butttonRK = new JButton(")");
		butttonRK.setFont(new Font("����", Font.BOLD, 18));

		buttonBack = new JButton("Back");
		buttonBack.setFont(new Font("����", Font.BOLD, 18));

		buttonC = new JButton("C");
		buttonC.setFont(new Font("����", Font.BOLD, 18));

		buttonEqu = new JButton("=");
		buttonEqu.setFont(new Font("����", Font.BOLD, 18));

		butttonOrg = new JButton(".");
		butttonOrg.setFont(new Font("����", Font.BOLD, 18));

	}

	// ��Ӹ�����ķ���
	private void addBut() {
		// �������λ�ðڷ�
		jf.setLayout(null);
		text.setBounds(0, 0, 500, 80);
		jf.add(text);
		button7.setBounds(0, 100, 100, 50);
		jf.add(button7);
		button8.setBounds(100, 100, 100, 50);
		jf.add(button8);
		button9.setBounds(200, 100, 100, 50);
		jf.add(button9);
		buttonAdd.setBounds(300, 100, 100, 50);
		jf.add(buttonAdd);
		buttonLK.setBounds(400, 100, 100, 50);
		jf.add(buttonLK);
		button4.setBounds(0, 150, 100, 50);
		jf.add(button4);
		button5.setBounds(100, 150, 100, 50);
		jf.add(button5);
		button6.setBounds(200, 150, 100, 50);
		jf.add(button6);
		buttonSub.setBounds(300, 150, 100, 50);
		jf.add(buttonSub);
		butttonRK.setBounds(400, 150, 100, 50);
		jf.add(butttonRK);
		button1.setBounds(0, 200, 100, 50);
		jf.add(button1);
		button2.setBounds(100, 200, 100, 50);
		jf.add(button2);
		button3.setBounds(200, 200, 100, 50);
		jf.add(button3);
		buttonMul.setBounds(300, 200, 100, 50);
		jf.add(buttonMul);
		buttonBack.setBounds(400, 200, 100, 50);
		jf.add(buttonBack);
		butttonOrg.setBounds(0, 250, 100, 50);
		jf.add(butttonOrg);
		button0.setBounds(100, 250, 100, 50);
		jf.add(button0);
		buttonEqu.setBounds(200, 250, 100, 50);
		jf.add(buttonEqu);
		buttonDiv.setBounds(300, 250, 100, 50);
		jf.add(buttonDiv);
		buttonC.setBounds(400, 250, 100, 50);
		jf.add(buttonC);
		initial();
	}

	// �������Ӽ�����
	private void initial() {
		button0.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		buttonAdd.addActionListener(this);
		buttonSub.addActionListener(this);
		buttonMul.addActionListener(this);
		buttonDiv.addActionListener(this);
		buttonEqu.addActionListener(this);
		buttonC.addActionListener(this);
		buttonLK.addActionListener(this);
		butttonRK.addActionListener(this);
		butttonOrg.addActionListener(this);
		buttonBack.addActionListener(this);

	}

	// ������������ʱ��ѹջ����
	public double cal(double num1, double num2, String operator) {
		double result = 0;
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num2 - num1; // ����ջ�׵���������
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			// ������Ϊ 0 �򷵻ؽ��������Ϊ 0 ������ʾ�Ի���
			if (num1 != 0) {
				result = num2 / num1; 
			} else {
				// ��ʾ�Ի���
				JOptionPane.showOptionDialog(jf, "��������Ϊ0", "��ܰ��ʾ", JOptionPane.DEFAULT_OPTION,
						JOptionPane.ERROR_MESSAGE, null, null, null);
				input="";
				text.setText(input);
			}
			break;
		default:
			JOptionPane.showOptionDialog(jf, "�������ʽ�޷�����", "��ܰ��ʾ��", JOptionPane.DEFAULT_OPTION,
					JOptionPane.ERROR_MESSAGE, null, null, null);
			input = "";
			text.setText(input);
			break;
		}
		return result;
	}

	// ��׺���ʽֵ�㷨
	public String calculate(String input) {
		String[] compute = input.split(" ");
		Stack<String> stack1 = new Stack<>(); // ���׺���ʽ
		Stack<String> stack2 = new Stack<>(); // ��ʱ�Ų�����
		Stack<String> stack3 = new Stack<>(); // �������ջ
		for (int i = 0; i < compute.length; ++i) {
			if (compute[i].matches("-?\\d+(\\.\\d+)?")) {
				stack1.push(compute[i]);
			} else if (stack2.isEmpty()) {
				stack2.push(compute[i]);
			} else if (compute[i].equals("(")) {
				stack2.push(compute[i]);
			} else if (compute[i].equals(")")) {
				while (!(stack2.peek().equals("("))) {
					stack1.push(stack2.pop());
				}
				stack2.pop();
			}
			// �Ӽ��˳���ջ
			else if (compute[i].equals("+") || compute[i].equals("-") || compute[i].equals("*")
					|| compute[i].equals("/") || compute[i].equals("(")) {
				while ((!stack2.isEmpty()) && (nPriority(compute[i]) <= nPriority(stack2.peek()))) {
					stack1.push(stack2.pop());
				}
				stack2.push(compute[i]);
			}
			// ����С����ֱ����ջ
			else
				stack1.push(compute[i]);
		}
		// ��������ջ��Ϊ�գ���������ȫ������ stack1
		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		// ������׺���ʽ
		for (String l : stack1) {
			String num1, num2;
			// ������ʽƥ�両����
			if (l.matches("-?\\d+(\\.\\d+)?")) {
				stack3.push(l);
			} else {
				if (stack3.isEmpty()) {
					num1 = "0";
				} else {
					num1 = stack3.pop();
				}
				if (stack3.isEmpty()) {
					num2 = "0";
				} else {
					num2 = stack3.pop();
				}
				double calculate = cal(Double.parseDouble(num1), Double.parseDouble(num2), l);
				stack3.push(String.valueOf(calculate));
			}
		}
		DecimalFormat df = new DecimalFormat("#0.0");
		return df.format(Double.parseDouble(stack3.pop()));
	}

	// ������������ȼ�
	public int nPriority(String str) {
		int n = 0;
		switch (str) {
		case "+":
		case "-":
			n = -1;
			break;
		case "*":
		case "/":
			n = 1;
			break;
		case "(":
			n = -2;
			break;
		case ")":
			n = 2;
		default:
			break;
		}
		return n;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int cnt = 0;
		String actionCommand = e.getActionCommand(); // ��ȡ��ť�ϵ��ַ���
		if (actionCommand.equals("+") || actionCommand.equals("-") || actionCommand.equals("*")
				|| actionCommand.equals("/")) {
			input += " " + actionCommand + " ";
		} else if (actionCommand.equals("Back")) {
			input = input.substring(0, input.length() - 1);
		} else if (actionCommand.equals("C")) {
			input = "";
		} else if (actionCommand.equals("=")) {
			try {
				input += " " + "=" + " " + calculate(input);
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			text.setText(input);
			input = "";
			cnt = 1;
		} else if (actionCommand.equals("(")) {
			input += actionCommand + " ";
		} else if (actionCommand.equals(")")) {
			input += " " + actionCommand;
		} else
			input += actionCommand;
		// ���ñ�־ cnt �����ı���ʼ����ʾ�����ַ���
		if (cnt == 0) {
			text.setText(input);
		}
	}

	public static void main(String[] args) {
		// ����������ͼ�ν��洰��
		new Carculator();
	}
}

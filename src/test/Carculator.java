package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Stack;

public class Carculator implements ActionListener {
	JFrame jf = new JFrame("简易计算器");// 内容窗格
	JTextField text = new JTextField(" ");
	JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;// 数字按钮
	JButton buttonAdd, buttonSub, buttonMul, buttonDiv, buttonLK, butttonRK, butttonOrg, buttonEqu, buttonC, buttonBack;// 符号按钮
	String input = "";

	Carculator() {
		text.setEditable(false);
		text.setFont(new Font("粗体", Font.PLAIN, 18));
		setButton();
		setThis();
		addBut();
	}

	private void setThis() {
		// 窗口大小
		jf.setSize(500, 335);
		// 窗口位置居中
		jf.setLocationRelativeTo(null);
		// 关闭窗口结束程序运行
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 窗口大小不可变
		jf.setResizable(false);
		// 窗口可见
		jf.setVisible(true);
	}

	// 设置按钮字体大小
	private void setButton() {
		button0 = new JButton("0");
		button0.setFont(new Font("粗体", Font.BOLD, 18));

		button1 = new JButton("1");
		button1.setFont(new Font("粗体", Font.BOLD, 18));

		button2 = new JButton("2");
		button2.setFont(new Font("粗体", Font.BOLD, 18));

		button3 = new JButton("3");
		button3.setFont(new Font("粗体", Font.BOLD, 18));

		button4 = new JButton("4");
		button4.setFont(new Font("粗体", Font.BOLD, 18));

		button5 = new JButton("5");
		button5.setFont(new Font("粗体", Font.BOLD, 18));
		button6 = new JButton("6");
		button6.setFont(new Font("粗体", Font.BOLD, 18));

		button7 = new JButton("7");
		button7.setFont(new Font("粗体", Font.BOLD, 18));

		button8 = new JButton("8");
		button8.setFont(new Font("粗体", Font.BOLD, 18));

		button9 = new JButton("9");
		button9.setFont(new Font("粗体", Font.BOLD, 18));

		buttonAdd = new JButton("+");
		buttonAdd.setFont(new Font("粗体", Font.BOLD, 18));

		buttonSub = new JButton("-");
		buttonSub.setFont(new Font("粗体", Font.BOLD, 18));

		buttonMul = new JButton("*");
		buttonMul.setFont(new Font("粗体", Font.BOLD, 18));

		buttonDiv = new JButton("/");
		buttonDiv.setFont(new Font("粗体", Font.BOLD, 18));

		buttonLK = new JButton("(");
		buttonLK.setFont(new Font("粗体", Font.BOLD, 18));

		butttonRK = new JButton(")");
		butttonRK.setFont(new Font("粗体", Font.BOLD, 18));

		buttonBack = new JButton("Back");
		buttonBack.setFont(new Font("粗体", Font.BOLD, 18));

		buttonC = new JButton("C");
		buttonC.setFont(new Font("粗体", Font.BOLD, 18));

		buttonEqu = new JButton("=");
		buttonEqu.setFont(new Font("粗体", Font.BOLD, 18));

		butttonOrg = new JButton(".");
		butttonOrg.setFont(new Font("粗体", Font.BOLD, 18));

	}

	// 添加各组件的方法
	private void addBut() {
		// 组件绝对位置摆放
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

	// 各组件添加监听器
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

	// 遍历到操作符时的压栈方法
	public double cal(double num1, double num2, String operator) {
		double result = 0;
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num2 - num1; // 靠近栈底的做被减数
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			// 除数不为 0 则返回结果，除数为 0 弹出提示对话框
			if (num1 != 0) {
				result = num2 / num1; 
			} else {
				// 提示对话框
				JOptionPane.showOptionDialog(jf, "除数不能为0", "温馨提示", JOptionPane.DEFAULT_OPTION,
						JOptionPane.ERROR_MESSAGE, null, null, null);
				input="";
				text.setText(input);
			}
			break;
		default:
			JOptionPane.showOptionDialog(jf, "算术表达式无法计算", "温馨提示您", JOptionPane.DEFAULT_OPTION,
					JOptionPane.ERROR_MESSAGE, null, null, null);
			input = "";
			text.setText(input);
			break;
		}
		return result;
	}

	// 后缀表达式值算法
	public String calculate(String input) {
		String[] compute = input.split(" ");
		Stack<String> stack1 = new Stack<>(); // 存后缀表达式
		Stack<String> stack2 = new Stack<>(); // 临时放操作符
		Stack<String> stack3 = new Stack<>(); // 最后运算栈
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
			// 加减乘除入栈
			else if (compute[i].equals("+") || compute[i].equals("-") || compute[i].equals("*")
					|| compute[i].equals("/") || compute[i].equals("(")) {
				while ((!stack2.isEmpty()) && (nPriority(compute[i]) <= nPriority(stack2.peek()))) {
					stack1.push(stack2.pop());
				}
				stack2.push(compute[i]);
			}
			// 数字小数点直接入栈
			else
				stack1.push(compute[i]);
		}
		// 当操作符栈不为空，将操作符全部弹入 stack1
		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		// 遍历后缀表达式
		for (String l : stack1) {
			String num1, num2;
			// 正则表达式匹配浮点数
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

	// 定义运算符优先级
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
		String actionCommand = e.getActionCommand(); // 获取按钮上的字符串
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
		// 设置标志 cnt ，让文本框始终显示输入字符串
		if (cnt == 0) {
			text.setText(input);
		}
	}

	public static void main(String[] args) {
		// 启动计算器图形界面窗口
		new Carculator();
	}
}

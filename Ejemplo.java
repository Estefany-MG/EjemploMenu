package Semana10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Toolkit;
import java.awt.Window.Type;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Insets;
import javax.swing.SwingConstants;

public class Ejemplo extends JFrame {

	private JPanel contentPane;
	private JTextArea textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo frame = new Ejemplo();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejemplo() {
		setBackground(new Color(230, 230, 250));
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\DATOS\\ING. SISTEMAS E INFORMATICA\\III CICLO\\PROGRAMACION ORIENTADA A OBJETOS II\\DECIMA SEMANA\\Ejemplo\\images\\lapiz.png"));
		setTitle("Bloc de notas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 410);
		
		
		JMenuBar menuBarra = new JMenuBar();
		menuBarra.setBackground(new Color(255, 255, 255));
		menuBarra.setForeground(Color.BLACK);
		menuBarra.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		menuBarra.setBorder(UIManager.getBorder("MenuBar.border"));
		setJMenuBar(menuBarra);
		
		JMenu mnArchivo = new JMenu("Archivo");
		mnArchivo.setBackground(new Color(248, 248, 255));
		mnArchivo.setContentAreaFilled(false);
		mnArchivo.setForeground(new Color(0, 0, 0));
		mnArchivo.setBorder(null);
		mnArchivo.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		menuBarra.add(mnArchivo);
		
		JMenuItem mntmNuevo = new JMenuItem("Nuevo");
		mntmNuevo.setAlignmentY(Component.TOP_ALIGNMENT);
		mntmNuevo.setAlignmentX(Component.LEFT_ALIGNMENT);
		mntmNuevo.setMargin(new Insets(0, 0, 0, 0));
		mntmNuevo.setBackground(new Color(248, 248, 255));
		mntmNuevo.setPreferredSize(new Dimension(230, mntmNuevo.getPreferredSize().height));
		mntmNuevo.setIcon(new ImageIcon("E:\\DATOS\\ING. SISTEMAS E INFORMATICA\\III CICLO\\PROGRAMACION ORIENTADA A OBJETOS II\\DECIMA SEMANA\\Ejemplo\\images\\agregar-archivo.png"));
		mntmNuevo.setForeground(new Color(0, 0, 0));
		mntmNuevo.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mntmNuevo.setBorder(null);
		mntmNuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mntmNuevo.setToolTipText("Ctrl+N");
		mntmNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnArchivo.add(mntmNuevo);
		
		JMenuItem mntmVentanaNueva = new JMenuItem("Ventana Nueva");
		mntmVentanaNueva.setMargin(new Insets(0, 0, 0, 0));
		mntmVentanaNueva.setAlignmentY(Component.TOP_ALIGNMENT);
		mntmVentanaNueva.setAlignmentX(Component.LEFT_ALIGNMENT);
		mntmVentanaNueva.setBackground(new Color(248, 248, 255));
		mntmVentanaNueva.setIcon(new ImageIcon("E:\\DATOS\\ING. SISTEMAS E INFORMATICA\\III CICLO\\PROGRAMACION ORIENTADA A OBJETOS II\\DECIMA SEMANA\\Ejemplo\\images\\nueva-ventana.png"));
		mntmVentanaNueva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmVentanaNueva.setForeground(new Color(0, 0, 0));
		mntmVentanaNueva.setBorder(null);
		mntmVentanaNueva.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mntmVentanaNueva.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmVentanaNueva);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir...");
		mntmAbrir.setMargin(new Insets(0, 0, 0, 0));
		mntmAbrir.setAlignmentY(Component.TOP_ALIGNMENT);
		mntmAbrir.setAlignmentX(Component.LEFT_ALIGNMENT);
		mntmAbrir.setBackground(new Color(248, 248, 255));
		mntmAbrir.setIcon(new ImageIcon("E:\\DATOS\\ING. SISTEMAS E INFORMATICA\\III CICLO\\PROGRAMACION ORIENTADA A OBJETOS II\\DECIMA SEMANA\\Ejemplo\\images\\abrir-documento.png"));
		mntmAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmAbrir.setForeground(new Color(0, 0, 0));
		mntmAbrir.setBorder(null);
		mntmAbrir.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mntmAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmAbrir);
		
		JMenuItem mntmGuardar = new JMenuItem("Guardar");
		mntmGuardar.setMargin(new Insets(0, 0, 0, 0));
		mntmGuardar.setAlignmentY(Component.TOP_ALIGNMENT);
		mntmGuardar.setAlignmentX(Component.LEFT_ALIGNMENT);
		mntmGuardar.setBackground(new Color(248, 248, 255));
		mntmGuardar.setIcon(new ImageIcon("E:\\DATOS\\ING. SISTEMAS E INFORMATICA\\III CICLO\\PROGRAMACION ORIENTADA A OBJETOS II\\DECIMA SEMANA\\Ejemplo\\images\\disco-flexible.png"));
		mntmGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmGuardar.setForeground(new Color(0, 0, 0));
		mntmGuardar.setBorder(null);
		mntmGuardar.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mntmGuardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmGuardar);
		
		JMenuItem mntmGuardarComo = new JMenuItem("Guardar como...");
		mntmGuardarComo.setMargin(new Insets(0, 0, 0, 0));
		mntmGuardarComo.setAlignmentY(Component.TOP_ALIGNMENT);
		mntmGuardarComo.setAlignmentX(Component.LEFT_ALIGNMENT);
		mntmGuardarComo.setBackground(new Color(248, 248, 255));
		mntmGuardarComo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmGuardarComo.setForeground(new Color(0, 0, 0));
		mntmGuardarComo.setBorder(null);
		mntmGuardarComo.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mnArchivo.add(mntmGuardarComo);
		
		JSeparator separator = new JSeparator();
		separator.setEnabled(false);
		separator.setForeground(new Color(211, 211, 211));
		separator.setBorder(null);
		separator.setBackground(new Color(255, 255, 255));
		mnArchivo.add(separator);
		
		JMenuItem mntmConfigurarPagina = new JMenuItem("Configurar p\u00E1gina...");
		mntmConfigurarPagina.setMargin(new Insets(0, 0, 0, 0));
		mntmConfigurarPagina.setAlignmentY(Component.TOP_ALIGNMENT);
		mntmConfigurarPagina.setAlignmentX(Component.LEFT_ALIGNMENT);
		mntmConfigurarPagina.setBackground(new Color(248, 248, 255));
		mntmConfigurarPagina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmConfigurarPagina.setForeground(new Color(0, 0, 0));
		mntmConfigurarPagina.setBorder(null);
		mntmConfigurarPagina.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mnArchivo.add(mntmConfigurarPagina);
		
		JMenuItem mntmImprimir = new JMenuItem("Imprimir...");
		mntmImprimir.setMargin(new Insets(0, 0, 0, 0));
		mntmImprimir.setAlignmentY(Component.TOP_ALIGNMENT);
		mntmImprimir.setAlignmentX(Component.LEFT_ALIGNMENT);
		mntmImprimir.setBackground(new Color(248, 248, 255));
		mntmImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmImprimir.setForeground(new Color(0, 0, 0));
		mntmImprimir.setBorder(null);
		mntmImprimir.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mntmImprimir.setIcon(new ImageIcon("E:\\DATOS\\ING. SISTEMAS E INFORMATICA\\III CICLO\\PROGRAMACION ORIENTADA A OBJETOS II\\DECIMA SEMANA\\Ejemplo\\images\\imprimir (1).png"));
		mntmImprimir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmImprimir);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(211, 211, 211));
		separator_1.setBorder(null);
		mnArchivo.add(separator_1);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.setMargin(new Insets(0, 0, 0, 0));
		mntmSalir.setAlignmentY(Component.TOP_ALIGNMENT);
		mntmSalir.setAlignmentX(Component.LEFT_ALIGNMENT);
		mntmSalir.setBackground(new Color(248, 248, 255));
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmSalir.setForeground(new Color(0, 0, 0));
		mntmSalir.setBorder(null);
		mntmSalir.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mnArchivo.add(mntmSalir);
		
		JMenu mnEdicion = new JMenu("Edici\u00F3n");
		mnEdicion.setForeground(new Color(0, 0, 0));
		mnEdicion.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mnEdicion.setBorder(null);
		menuBarra.add(mnEdicion);
		
		JMenuItem mntmDeshacer = new JMenuItem("Deshacer");
		mntmDeshacer.setBackground(new Color(248, 248, 255));
		mntmDeshacer.setPreferredSize(new Dimension(230, mntmDeshacer.getPreferredSize().height));
		mntmDeshacer.setIcon(new ImageIcon("E:\\DATOS\\ING. SISTEMAS E INFORMATICA\\III CICLO\\PROGRAMACION ORIENTADA A OBJETOS II\\DECIMA SEMANA\\Ejemplo\\images\\deshacer-flecha.png"));
		mntmDeshacer.setForeground(new Color(0, 0, 0));
		mntmDeshacer.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mntmDeshacer.setBorder(null);
		mntmDeshacer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK));
		mntmDeshacer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnEdicion.add(mntmDeshacer);
		
		JMenuItem mntmCortar = new JMenuItem("Cortar");
		mntmCortar.setBackground(new Color(248, 248, 255));
		mntmCortar.setIcon(new ImageIcon("E:\\DATOS\\ING. SISTEMAS E INFORMATICA\\III CICLO\\PROGRAMACION ORIENTADA A OBJETOS II\\DECIMA SEMANA\\Ejemplo\\images\\cupon.png"));
		mntmCortar.setForeground(new Color(0, 0, 0));
		mntmCortar.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mntmCortar.setBorder(null);
		mntmCortar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		mntmCortar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(211, 211, 211));
		separator_2.setBorder(null);
		mnEdicion.add(separator_2);
		mnEdicion.add(mntmCortar);
		
		JMenuItem mntmCopiar = new JMenuItem("Copiar");
		mntmCopiar.setBackground(new Color(248, 248, 255));
		mntmCopiar.setIcon(new ImageIcon("E:\\DATOS\\ING. SISTEMAS E INFORMATICA\\III CICLO\\PROGRAMACION ORIENTADA A OBJETOS II\\DECIMA SEMANA\\Ejemplo\\images\\copiar-el-simbolo-de-interfaz-de-dos-hojas-de-papel.png"));
		mntmCopiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmCopiar.setForeground(new Color(0, 0, 0));
		mntmCopiar.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mntmCopiar.setBorder(null);
		mntmCopiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		mnEdicion.add(mntmCopiar);
		
		JMenuItem mntmPegar = new JMenuItem("Pegar");
		mntmPegar.setBackground(new Color(248, 248, 255));
		mntmPegar.setIcon(new ImageIcon("E:\\DATOS\\ING. SISTEMAS E INFORMATICA\\III CICLO\\PROGRAMACION ORIENTADA A OBJETOS II\\DECIMA SEMANA\\Ejemplo\\images\\pegar.png"));
		mntmPegar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmPegar.setForeground(new Color(0, 0, 0));
		mntmPegar.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mntmPegar.setBorder(null);
		mntmPegar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
		mnEdicion.add(mntmPegar);
		
		JMenuItem mntmEliminar = new JMenuItem("Eliminar");
		mntmEliminar.setBackground(new Color(248, 248, 255));
		mntmEliminar.setIcon(new ImageIcon("E:\\DATOS\\ING. SISTEMAS E INFORMATICA\\III CICLO\\PROGRAMACION ORIENTADA A OBJETOS II\\DECIMA SEMANA\\Ejemplo\\images\\eliminar.png"));
		mntmEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmEliminar.setForeground(new Color(0, 0, 0));
		mntmEliminar.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mntmEliminar.setBorder(null);
		mntmEliminar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
		mnEdicion.add(mntmEliminar);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(211, 211, 211));
		separator_3.setBorder(null);
		mnEdicion.add(separator_3);
		
		JMenuItem mntmBuscar = new JMenuItem("Buscar");
		mntmBuscar.setBackground(new Color(248, 248, 255));
		mntmBuscar.setIcon(new ImageIcon("E:\\DATOS\\ING. SISTEMAS E INFORMATICA\\III CICLO\\PROGRAMACION ORIENTADA A OBJETOS II\\DECIMA SEMANA\\Ejemplo\\images\\lupa.png"));
		mntmBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmBuscar.setForeground(new Color(0, 0, 0));
		mntmBuscar.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mntmBuscar.setBorder(null);
		mntmBuscar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_MASK));
		mnEdicion.add(mntmBuscar);
		
		JMenuItem mntmReemplazar = new JMenuItem("Reemplazar");
		mntmReemplazar.setBackground(new Color(248, 248, 255));
		mntmReemplazar.setIcon(new ImageIcon("E:\\DATOS\\ING. SISTEMAS E INFORMATICA\\III CICLO\\PROGRAMACION ORIENTADA A OBJETOS II\\DECIMA SEMANA\\Ejemplo\\images\\reemplazar.png"));
		mntmReemplazar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmReemplazar.setForeground(new Color(0, 0, 0));
		mntmReemplazar.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mntmReemplazar.setBorder(null);
		mntmReemplazar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK));
		mnEdicion.add(mntmReemplazar);
		
		JMenuItem mntmIrA = new JMenuItem("Ir a...");
		mntmIrA.setBackground(new Color(248, 248, 255));
		mntmIrA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmIrA.setForeground(new Color(0, 0, 0));
		mntmIrA.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mntmIrA.setBorder(null);
		mntmIrA.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_MASK));
		mnEdicion.add(mntmIrA);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(new Color(211, 211, 211));
		separator_4.setBorder(null);
		mnEdicion.add(separator_4);
		
		JMenuItem mntmSeleccionarTodo = new JMenuItem("Seleccionar todo");
		mntmSeleccionarTodo.setBackground(new Color(248, 248, 255));
		mntmSeleccionarTodo.setIcon(new ImageIcon("E:\\DATOS\\ING. SISTEMAS E INFORMATICA\\III CICLO\\PROGRAMACION ORIENTADA A OBJETOS II\\DECIMA SEMANA\\Ejemplo\\images\\seleccion.png"));
		mntmSeleccionarTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmSeleccionarTodo.setForeground(new Color(0, 0, 0));
		mntmSeleccionarTodo.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mntmSeleccionarTodo.setBorder(null);
		mntmSeleccionarTodo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
		mnEdicion.add(mntmSeleccionarTodo);
		
		JMenuItem mntmHorayFecha = new JMenuItem("Hora y fecha");
		mntmHorayFecha.setBackground(new Color(248, 248, 255));
		mntmHorayFecha.setIcon(new ImageIcon("E:\\DATOS\\ING. SISTEMAS E INFORMATICA\\III CICLO\\PROGRAMACION ORIENTADA A OBJETOS II\\DECIMA SEMANA\\Ejemplo\\images\\calendario.png"));
		mntmHorayFecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmHorayFecha.setForeground(new Color(0, 0, 0));
		mntmHorayFecha.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mntmHorayFecha.setBorder(null);
		mntmHorayFecha.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
		mnEdicion.add(mntmHorayFecha);
		
		JMenu mnFormato = new JMenu("Formato");
		mnFormato.setBackground(new Color(248, 248, 255));
		mnFormato.setForeground(new Color(0, 0, 0));
		mnFormato.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mnFormato.setBorder(null);
		menuBarra.add(mnFormato);
		
		JCheckBoxMenuItem mntmAjusteLinea = new JCheckBoxMenuItem("Ajuste de l\u00EDnea");
		mntmAjusteLinea.setBackground(new Color(248, 248, 255));
		mntmAjusteLinea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmAjusteLinea.setForeground(new Color(0, 0, 0));
		mntmAjusteLinea.setBorder(null);
		mntmAjusteLinea.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mnFormato.add(mntmAjusteLinea);
		
		JMenuItem mntmFuente = new JMenuItem("Fuente...");
		mntmFuente.setBackground(new Color(248, 248, 255));
		mntmFuente.setIcon(new ImageIcon("E:\\DATOS\\ING. SISTEMAS E INFORMATICA\\III CICLO\\PROGRAMACION ORIENTADA A OBJETOS II\\DECIMA SEMANA\\Ejemplo\\images\\tipografia.png"));
		mntmFuente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmFuente.setForeground(new Color(0, 0, 0));
		mntmFuente.setBorder(null);
		mntmFuente.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mnFormato.add(mntmFuente);
		
		JMenu mnVer = new JMenu("Ver");
		mnVer.setForeground(new Color(0, 0, 0));
		mnVer.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mnVer.setBorder(null);
		menuBarra.add(mnVer);
		
		JMenu mnZoom = new JMenu("Zoom");
		mnZoom.setBackground(new Color(248, 248, 255));
		mnZoom.setIcon(new ImageIcon("E:\\DATOS\\ING. SISTEMAS E INFORMATICA\\III CICLO\\PROGRAMACION ORIENTADA A OBJETOS II\\DECIMA SEMANA\\Ejemplo\\images\\enfocar.png"));
		mnZoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnZoom.setForeground(new Color(0, 0, 0));
		mnZoom.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mnZoom.setBorder(null);
		mnVer.add(mnZoom);
		
		JMenuItem mntmAcercar = new JMenuItem("Acercar");
		mntmAcercar.setBackground(new Color(248, 248, 255));
		mntmAcercar.setIcon(new ImageIcon("E:\\DATOS\\ING. SISTEMAS E INFORMATICA\\III CICLO\\PROGRAMACION ORIENTADA A OBJETOS II\\DECIMA SEMANA\\Ejemplo\\images\\acercarse.png"));
		mntmAcercar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmAcercar.setForeground(new Color(0, 0, 0));
		mntmAcercar.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mntmAcercar.setBorder(null);
		mntmAcercar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, InputEvent.CTRL_MASK));
		mnZoom.add(mntmAcercar);
		
		JMenuItem mntmAlejar = new JMenuItem("Alejar");
		mntmAlejar.setBackground(new Color(248, 248, 255));
		mntmAlejar.setIcon(new ImageIcon("E:\\DATOS\\ING. SISTEMAS E INFORMATICA\\III CICLO\\PROGRAMACION ORIENTADA A OBJETOS II\\DECIMA SEMANA\\Ejemplo\\images\\disminuir-el-zoom.png"));
		mntmAlejar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmAlejar.setForeground(new Color(0, 0, 0));
		mntmAlejar.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mntmAlejar.setBorder(null);
		mntmAlejar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, InputEvent.CTRL_MASK));
		mnZoom.add(mntmAlejar);
		
		JMenuItem mntmRestaurarZoom = new JMenuItem("Restaurar zoom predeterminado");
		mntmRestaurarZoom.setBackground(new Color(248, 248, 255));
		mntmRestaurarZoom.setIcon(new ImageIcon("E:\\DATOS\\ING. SISTEMAS E INFORMATICA\\III CICLO\\PROGRAMACION ORIENTADA A OBJETOS II\\DECIMA SEMANA\\Ejemplo\\images\\enfocar2.png"));
		mntmRestaurarZoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmRestaurarZoom.setForeground(new Color(0, 0, 0));
		mntmRestaurarZoom.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mntmRestaurarZoom.setBorder(null);
		mntmRestaurarZoom.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, InputEvent.CTRL_MASK));
		mnZoom.add(mntmRestaurarZoom);
		
		JCheckBoxMenuItem mntmBarraEstado = new JCheckBoxMenuItem("Barra de estado");
		mntmBarraEstado.setBackground(new Color(248, 248, 255));
		mntmBarraEstado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmBarraEstado.setForeground(new Color(0, 0, 0));
		mntmBarraEstado.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mntmBarraEstado.setBorder(null);
		mnVer.add(mntmBarraEstado);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		mnAyuda.setForeground(new Color(0, 0, 0));
		mnAyuda.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mnAyuda.setBorder(null);
		menuBarra.add(mnAyuda);
		
		JMenuItem mntmVerAyuda = new JMenuItem("Ver la Ayuda");
		mntmVerAyuda.setBackground(new Color(248, 248, 255));
		mntmVerAyuda.setPreferredSize(new Dimension(180, mntmVerAyuda.getPreferredSize().height));
		mntmVerAyuda.setIcon(new ImageIcon("E:\\DATOS\\ING. SISTEMAS E INFORMATICA\\III CICLO\\PROGRAMACION ORIENTADA A OBJETOS II\\DECIMA SEMANA\\Ejemplo\\images\\informacion.png"));
		mntmVerAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmVerAyuda.setBorder(null);
		mntmVerAyuda.setForeground(new Color(0, 0, 0));
		mntmVerAyuda.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mnAyuda.add(mntmVerAyuda);
		
		JMenuItem mntmEnviarComentarios = new JMenuItem("Enviar comentarios");
		mntmEnviarComentarios.setBackground(new Color(248, 248, 255));
		mntmEnviarComentarios.setIcon(new ImageIcon("E:\\DATOS\\ING. SISTEMAS E INFORMATICA\\III CICLO\\PROGRAMACION ORIENTADA A OBJETOS II\\DECIMA SEMANA\\Ejemplo\\images\\conversacion.png"));
		mntmEnviarComentarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmEnviarComentarios.setBorder(null);
		mntmEnviarComentarios.setForeground(new Color(0, 0, 0));
		mntmEnviarComentarios.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mnAyuda.add(mntmEnviarComentarios);
		
		JMenuItem mntmAcercaDe = new JMenuItem("Acerca de...");
		mntmAcercaDe.setBackground(new Color(248, 248, 255));
		mntmAcercaDe.setIcon(new ImageIcon("E:\\DATOS\\ING. SISTEMAS E INFORMATICA\\III CICLO\\PROGRAMACION ORIENTADA A OBJETOS II\\DECIMA SEMANA\\Ejemplo\\images\\esquema-de-boton-circular-de-informacion.png"));
		mntmAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmAcercaDe.setBorder(null);
		mntmAcercaDe.setForeground(new Color(0, 0, 0));
		mntmAcercaDe.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mnAyuda.add(mntmAcercaDe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextArea();
		textField.setBackground(new Color(248, 248, 255));
		contentPane.add(textField);
		textField.setColumns(10);
	}

}

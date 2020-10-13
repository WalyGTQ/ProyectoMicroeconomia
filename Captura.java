package Arreglos;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Walt
 */
public class Captura extends javax.swing.JFrame {
    
    
     private JLabel etiqueta1;
     boolean bol = true;
    
    DefaultTableModel modelo;
    
    String esp[];
    ArrayList<String> es = new ArrayList<String>();
    ArrayList<String> en = new ArrayList<String>();
    

    /**
     * Creates new form Palabras2
     */
    public Captura() {
        initComponents();
        etiquetas();
        
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
        
        modelo = new DefaultTableModel();
        modelo.addColumn("No.");
        modelo.addColumn("Termino");
        modelo.addColumn("Significado");
        this.tabla.setModel(modelo);
        
        
        //Datos De Fabrica
        String palabra[]=new String[3];
        palabra[0]="1";
        palabra[1]="Economia";
        palabra[2]="La economía es la ciencia social que estudia: La extracción, producción, intercambio, distribución y consumo de bienes y servicios; La forma o medios de satisfacer las necesidades humanas ilimitadas mediante recursos limitados; La forma en la que las personas y sociedades sobreviven, prosperan y funcionan.";
        modelo.addRow(palabra);
        es.add(palabra[1]);
        en.add(palabra[2]);
        
        String palabra2[]={"2","Economia Sostenible","También conocida como desarrollo sostenible, es un nuevo término que se ha puesto de moda en los últimos años y que encierra un proyecto de vida social basado en la reutilización de la materia prima para fines diversos. Se trata de cambiar el proceso de productividad en base a una economía basada en el cuidado del medio ambiente y en la mejora de la calidad de vida de una sociedad. Básicamente se busca satisfacer las necesidades de las generaciones que se hallan viviendo en un determinado espacio temporal sin poner en riesgo la subsistencia o las posibilidades económicas de las futuras generaciones."};
        es.add(palabra2[1]);
        en.add(palabra2[2]);
        modelo.addRow(palabra2);
        
        String palabra3[]={"3","Economia Empresarial","Es la forma en la que una organización, puede manejar sus recursos y servicios, ofreciendo una visión competitiva frente al mercado. Se vale de varias disciplinas científicas que permiten llevar a cabo dicha labor. Es una forma de aplicar economía en el ámbito de una empresa y deben tenerse en cuenta para su buen funcionamiento valores externos como índices de la bolsa, demanda de mercado y otras variables."};
        es.add(palabra3[1]);
        en.add(palabra3[2]);
        modelo.addRow(palabra3);
        
        String palabra4[]={"4","Economia Natural","Como lo define el biólogo M.T. Ghiselin, es el estudio de las consecuencias que la escasez causa en los seres vivos. Proponiendo un análisis profundo sobre las acciones humanas y sus efectos secundarios en el medio ambiente."};
        es.add(palabra4[1]);
        en.add(palabra4[2]);
        modelo.addRow(palabra4);
        
        String palabra5[]={"5","Economia Politica","Es el estudio de los comportamientos humanos, examinados dentro de un contexto jurídico característico. La economía política se relaciona con la economía natural en cuanto a que las acciones humanas, su economía política puede afectar el entorno natural, de forma positiva o negativa, la interacción de los seres vivos con el medio lo modifica siempre."};
        es.add(palabra5[1]);
        en.add(palabra5[2]);
        modelo.addRow(palabra5);
        
        String palabra6[]={"6","Macroeconomia","La macroeconomía es la parte de la economía que se encarga de estudiar el funcionamiento económico en general, así como las políticas económicas que se llevan a cabo en grandes escala, por ejemplo en un país. Es decir, engloba a la sociedad en su conjunto funcionando de una sola vez, no de forma independiente.\n" +
                            "Algunas de las variables más usadas son el Producto Interior Bruto, la tasa de desempleo, los niveles de impuestos o el nivel de interés, entre otros."};
        es.add(palabra6[1]);
        en.add(palabra6[2]);
        modelo.addRow(palabra6);
        
        String palabra7[]={"7","Microeconomia","La microeconomía es la parte que se encarga del comportamiento de cada agente económico de forma individual, como pueden ser las familias, las empresas o los trabajadores.\n" +
                            "\n" +
                            "En ella se analiza de forma exhaustiva leyes como la oferta y la demanda, entre los consumidores y los oferentes, el nivel de precios, o las elasticidades de cada producto. Es decir, el cómo se llega a un acuerdo entre las necesidades de los consumidores y las empresas que ofrecen los bienes y servicios, así como todas las variables \"psicológicas\" que pueden afectar, cómo la calidad del producto o las distintas necesidades de cada persona."};
        es.add(palabra7[1]);
        en.add(palabra7[2]);
        modelo.addRow(palabra7);
        
        String palabra8[]={"8","Bienes","Los bienes económicos o bienes escasos, por oposición a los bienes libres, son aquellos que se adquieren en el mercado, pero pagando un precio por ellos y que satisface directa o indirectamente una necesidad​. ... En este sentido, el término bien se utiliza para nombrar cosas que son útiles a quienes las usan o poseen"};
        es.add(palabra8[1]);
        en.add(palabra8[2]);
        modelo.addRow(palabra8);
        
        String palabra9[]={"9","Servicio","Un servicio podría ser un conjunto de actividades que buscan satisfacer las necesidades de un cliente."};
        es.add(palabra9[1]);
        en.add(palabra9[2]);
        modelo.addRow(palabra9);
        
        String palabra10[]={"10","Mercado","El mercado se puede definir como un proceso que opera cuando hay personas que actúan como compradores y otras como vendedores de bienes y servicios, generando la acción del intercambio.\n" +
                            "\n" +
                            "Tradicionalmente el mercado era entendido como un lugar donde se efectúan los procesos de cambio de bienes y servicios, entre demandantes y oferentes, pero con la aparición de la tecnología, los mercados ya no necesitan un espacio físico."};
        es.add(palabra10[1]);
        en.add(palabra10[2]);
        modelo.addRow(palabra10);  
        
        String palabra11[]={"11","Empresa","Una empresa es una organización o institución dedicada a actividades o persecución de fines económicos o comerciales para satisfacer las necesidades de bienes o servicios de la sociedad."};
        es.add(palabra11[1]);
        en.add(palabra11[2]);
        modelo.addRow(palabra11); 
        
        String palabra12[]={"12","Planeamiento","Se conoce como planificación, planeación o planteamiento, generalmente en países de habla hispana, pero en el sentido más universal, implica tener uno o varios objetivos en común, junto con acciones requeridas para concluirse exitosamente. Otras definiciones, más precisas, incluyen la planificación como un proceso de toma de decisiones para alcanzar un futuro deseado, teniendo en cuenta la situación actual y los factores internos y externos que pueden influir en el logro de los objetivos. Va de lo más simple a lo complejo, dependiendo del medio a aplicarse"};
        es.add(palabra12[1]);
        en.add(palabra12[2]);
        modelo.addRow(palabra12);
        
        String palabra13[]={"13","Entidad","En filosofía, una entidad o ente es algo que es de alguna manera determinada, o que existe. El término «ente», así como el de ser es muy general y vago, ya que en la historia de la filosofía occidental se ha usado con diversos sentidos."};
        es.add(palabra13[1]);
        en.add(palabra13[2]);
        modelo.addRow(palabra13);
        
        String palabra14[]={"14","Producto","En mercadotecnia, un producto es una opción elegible, viable y repetible que la oferta pone a disposición de la demanda, para satisfacer una necesidad o atender un deseo a través de su uso o consumo.​El producto es uno de los componentes estructurales de la mezcla de mercadotecnia"};
        es.add(palabra14[1]);
        en.add(palabra14[2]);
        modelo.addRow(palabra14);
        
        String palabra15[]={"15","Produccion","Desde el punto de vista de la economía, la producción es la actividad que aporta valor agregado por creación y suministro de bienes y servicios, es decir, consiste en la creación de productos o servicios y, al mismo tiempo, la creación de valor, también por producción en un sentido amplio, entendemos el incorporar utilidades nuevas a las cosas, es decir, no solamente la generación de producto con cualidades distintas a su origen,es decir modificaciones a su estructura natural del factor que le otorga un nuevo uso. Es la actividad que se desarrolla dentro de un sistema económico. Más específicamente, se trata de la capacidad que tiene un factor productivo para crear determinados bienes en un periodo determinado."};
        es.add(palabra15[1]);
        en.add(palabra15[2]);
        modelo.addRow(palabra15);
        
        String palabra16[]={"16","Compra","La compra es el proceso que utiliza una empresa u organización para adquirir bienes o servicios para lograr sus objetivos. Aunque hay varias organizaciones que intentan establecer estándares en el proceso de compra, los procesos pueden variar mucho entre organizaciones."};
        es.add(palabra16[1]);
        en.add(palabra16[2]);
        modelo.addRow(palabra16);
        
        String palabra17[]={"17","Venta","El término «ventas» comprende todas las actividades necesarias para proveer a un cliente o empresa de un producto o servicio a cambio de dinero. Sin embargo, para las empresas, las connotaciones de esta palabra van mucho más allá.\n" +
                            "\n" +
                            "Las empresas tienen departamentos con empleados dedicados especialmente a vender productos y servicios."};
        es.add(palabra17[1]);
        en.add(palabra17[2]);
        modelo.addRow(palabra17);
        
        String palabra18[]={"18","Necesidad","Una necesidad es el estado de un ser en que se halla en carencia de un elemento, y su consecución resulta indispensable para vivir en un estado de bienestar corporal pleno."};
        es.add(palabra18[1]);
        en.add(palabra18[2]);
        modelo.addRow(palabra18);
        
        String palabra19[]={"19","Factores De Produccion","Los factores de producción son los diferentes recursos que una empresa o una persona utiliza para crear y producir bienes y servicios. Los factores clásicos son tres: la tierra, el trabajo y el capital; cada cual con sus respectivos ingresos: las rentas, los salarios y las ganancias"};
        es.add(palabra19[1]);
        en.add(palabra19[2]);
        modelo.addRow(palabra19);
        
        String palabra20[]={"20","Ingreso","Son incrementos en el patrimonio neto de la empresa durante el ejercicio, ya sea en forma de entradas o aumentos en el valor de los activos, o de disminución de los pasivos, siempre que no tengan su origen en aportaciones, monetarias o no, de los socios o propietarios. Cuando el ingreso proviene de actividades productivas, puede clasificarse en:\n" +
                            "\n" +
                            "Ingreso total\n" +
                            "Ingreso marginal: generado por el aumento de la producción en una unidad.\n" +
                            "Ingreso medio: se obtiene, en promedio, por cada unidad de producto vendida; es decir, es el ingreso total dividido en el total de unidades vendidas.\n" +
                            "Ingreso del producto marginal: generado por la tarea de contabilidad de algún factor de producción (trabajo, capital como vaupes);por ejemplo, la utilización de un trabajador más."+"Los ingresos también pueden clasificarse en ordinarios y extraordinarios. Los ingresos ordinarios son aquellos que se obtienen de forma habitual y consuetudinaria; por ejemplo, el salario de un trabajador que se ocupa en un trabajo estable o las ventas de una empresa a un cliente que compra periódicamente o de forma habitual. Los ingresos extraordinarios son aquellos que provienen de acontecimientos especiales; por ejemplo, un negocio inesperado por parte de una persona o una emisión de bonos por parte de un gobierno."};
        es.add(palabra20[1]);
        en.add(palabra20[2]);
        modelo.addRow(palabra20);
        
        String palabra21[]={"21","Gasto","Un gasto es un egreso o salida de dinero que una persona o empresa debe pagar para acreditar su derecho sobre un artículo o a recibir un servicio. Sin embargo, hay bultos y diferencias entre el dinero que destina una persona del dinero que destina una empresa."};
        es.add(palabra21[1]);
        en.add(palabra21[2]);
        modelo.addRow(palabra21);
        
        String palabra22[]={"22","Renta","La renta en economía es el precio de los insumos de oferta fija como lo son por ejemplo la tierra,el capital o incluso de un talento único como por ejemplo el futbolista Messi o la cantante Beyoncé. Se trata de un flujo de ingresos que se reciben por el uso o alquiler de dichos insumos."};
        es.add(palabra22[1]);
        en.add(palabra22[2]);
        modelo.addRow(palabra22);
        
        String palabra23[]={"23","Salario","El salario o sueldo es la suma de cantidad económica y otros pagos que un trabajador recibe de forma periódica por parte del empleador como pago por su trabajo."};
        es.add(palabra23[1]);
        en.add(palabra23[2]);
        modelo.addRow(palabra23);
        
        String palabra24[]={"24","Presupuesto","En economía, un presupuesto se refiere a la cantidad de dinero que se necesita para hacer frente a cierto número de gastos necesarios para acometer un proyecto. De tal manera, se puede definir como una cifra anticipada que estima el coste que va a suponer la realización de dicho objetivo."};
        es.add(palabra24[1]);
        en.add(palabra24[2]);
        modelo.addRow(palabra24);
        
        String palabra25[]={"25","Utilidad Marginal","Esta última es la satisfacción o utilidad que obtiene un individuo por el consumo de una cierta cantidad de bienes o servicios. La utilidad marginal es el cambio en la utilidad total cuando se consume una unidad adicional de bien o servicio."};
        es.add(palabra25[1]);
        en.add(palabra25[2]);
        modelo.addRow(palabra25);
        
        String palabra26[]={"26","Utilidad","En economía, la utilidad es la medida de satisfacción del consumidor al obtener un producto. Asumiendo la validez de esta medida, se puede hablar con intención de aumentar o disminuir la utilidad, y por lo tanto explicar el comportamiento económico en términos de los intentos de aumentar la utilidad"};
        es.add(palabra26[1]);
        en.add(palabra26[2]);
        modelo.addRow(palabra26);
        
        String palabra27[]={"27","Oferta","En economía, se define la oferta como aquella propiedad dispuesta para ser enajenada a cambio de un precio. Cuando las condiciones de mercado vienen caracterizadas por el precio en conjunto de todos los pares de precio de mercado y oferta, forman la llamada curva de oferta. Hay que diferenciar por tanto la curva de oferta, de una oferta actual o cantidad ofrecida (que en general sería un punto concreto de dicha oferta), que hace referencia a la cantidad que los productores están dispuestos a vender a un determinado precio."};
        es.add(palabra27[1]);
        en.add(palabra27[2]);
        modelo.addRow(palabra27);
        
        String palabra28[]={"28","Demanda","La demanda puede ser definida como la cantidad de bienes y servicios que son adquiridos por consumidores a diferentes precios, a de una unidad de tiempo específica (un día, un mes, un año, etc) ya que sin un parámetro temporal no podemos decir si de una cantidad de demanda crece o decrece.\n" +
                            "\n" +
                            "Cuando una persona elige comprar algún bien, para cumplir sus necesidades, lo hace conscientemente, con base en sus criterios tanto objetivos como subjetivos; estas condiciones se modifican acorde al nivel educativo y socioeconómico, sexo, edad, entre otros factores."};
        es.add(palabra28[1]);
        en.add(palabra28[2]);
        modelo.addRow(palabra28);
        
        String palabra29[]={"29","Precio","El precio es el pago o recompensa que se asigna a la obtención de bienes o servicios o, más en general, a una mercancía cualquiera. A pesar de que tal pago no necesariamente se efectúa en dinero los precios son generalmente referidos o medidos en unidades monetarias."};
        es.add(palabra29[1]);
        en.add(palabra29[2]);
        modelo.addRow(palabra29);
        
        String palabra30[]={"30","Monopolio","En economía, un monopolio (del griego monos / μονος (solo o sola) polein / πωλειν (vender)) existe cuando una persona en particular o una empresa tiene suficiente control sobre un producto o servicio en particular para determinar de manera significativa las condiciones en que otras personas tendrán acceso a ella. \n" +
                            "\n" +
                            "(Esto está en contraste con un monopsonio que se refiere al control de una sola entidad a lo largo de un mercado para comprar un bien o servicio. Y en contraste con eloligopolio, donde unas pocas entidades ejercen una influencia considerable sobre una industria). Los monopolios son así caracterizado por la falta de competencia económica para el bien o servicio que prestan y la falta de bienes sustitutos viables. El verbo \"monopolizar\" se refiere al proceso mediante el cual una empresa obtiene una mayor cuota de mercado que constantemente lo que se espera en perfectas la competencia."};
        es.add(palabra30[1]);
        en.add(palabra30[2]);
        modelo.addRow(palabra30);
        
    }
    
    
    private void etiquetas(){
                //Etiqueta Imagen 1
        ImageIcon imagen = new ImageIcon("titulo.jpg");// definicion de imagen
        etiqueta1 = new JLabel(imagen);
        etiqueta1.setBounds(35, 0, 400, 150);//posicion y anchoy largo
        etiqueta1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta1.getWidth(), etiqueta1.getHeight(), Image.SCALE_SMOOTH)));//ADECUAMOS EL TAMAÑO DE LA IMAGEN CON EL DE ARRIBA
        jLabel2.add(etiqueta1); 
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        traducir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnmodificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdato = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnelimiartodo = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diccionario De Economia Waly");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setPreferredSize(new java.awt.Dimension(450, 510));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arreglos/title1.jpg"))); // NOI18N

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 255, 255), new java.awt.Color(255, 204, 0)));

        traducir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arreglos/traducir.jpg"))); // NOI18N
        traducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traducirActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arreglos/flechita copia.jpg"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arreglos/Limpiar.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basica", "Avanzado" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arreglos/ver.jpg"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arreglos/modo.jpg"))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arreglos/creditos.jpg"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 0), new java.awt.Color(255, 153, 0)));
        jScrollPane2.setViewportView(jTextArea1);

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Ingrese una palabra para Buscar");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Modificar Palabra");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Ingrese Dato Nuevo");

        txtdato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnmodificar)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(txtdato)))
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnmodificar)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        btnelimiartodo.setText("Elimiar Todo");
        btnelimiartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnelimiartodoActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar Seleccion");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Eliminar Palabra");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnelimiartodo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(btneliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btneliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnelimiartodo)
                .addGap(16, 16, 16))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 0)));

        btn1.setText("Agregar");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        txt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 51));
        jLabel7.setText("Nueva Palabra");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Palabra:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Significado:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt2))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn1)
                .addGap(43, 43, 43))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn1))
        );

        tabla.setBackground(new java.awt.Color(204, 204, 204));
        tabla.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tabla);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Editar Palabras");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField1)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(traducir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5))
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel12))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(traducir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 932, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void colocarEtiquetas(){
        
    }
    
    //Aca Va el evento tanto para traducir el mensaje como tambien para validar si esta vacio o no el diccionario        Traducir
    private void traducirActionPerformed(java.awt.event.ActionEvent evt) {                                         
         // TODO add your handling code here:
         
         String Palabra = jTextField1.getText().toLowerCase();
         char caracter = Palabra.charAt(0);
         String cadena = Character.toString(caracter);
         String Palabra2 =  cadena.toUpperCase()+Palabra.substring(1, Palabra.length()).toLowerCase();
         jTextField1.setText(Palabra2);
         
         
         jTextArea1.setText("");
         jTextArea1.append(jTextField1.getText()+":\n\n");
        String Texto1=jTextField1.getText();
        if(Texto1.equals("")){
            JOptionPane.showMessageDialog(null,"Agregue algo para Traducir");
        }else{
            if(es.isEmpty() | en.isEmpty() ){
            JOptionPane.showMessageDialog(null,"Diccionario Vacio");
            }else{
                
                for (int i = 0; i < es.size(); i++) {
                    if(Texto1.equals(es.get(i)) ){
                        String resultado1=(String) en.get(i);
                        //System.out.println(resultado1);
                        jTextArea1.append(resultado1);
                        bol=true;
                        break;
                    }else{
                        if(Texto1.equals(es.get(i))==false){
                           bol=false; 
                        }  
                    }
                } 
                if(bol==false){
                    JOptionPane.showMessageDialog(null,"Traduccion NO encontrada");
                } 
            }   
        }   
    }                                        

    
    
    //En esta parte esta el evento para modificar un registro en especifico                                              MOdificar
    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        if(txtdato.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Para Modificar Necesita Seleccionar la Casilla Y Agregar Alguna Palabra, el campo no puede estar vacio ");  
        }else{
            int fila2=tabla.getSelectedRow();
            if(fila2 >= 0){
                modelo.setValueAt(txtdato.getText(), tabla.getSelectedRow(), tabla.getSelectedColumn());  
                if(tabla.getSelectedColumn()==1){
                    es.set(fila2,txtdato.getText());  
                }else
                    if(tabla.getSelectedColumn()==2){
                        en.set(fila2,txtdato.getText());  
                    }   
            }else{
                JOptionPane.showMessageDialog(null,"Seleccione Una Casilla Para Modificar ");
            }
            
            
        }

    }                                            
    
    
    
    //Este es el evento en el boton para Borrar todos lo elementos                                                       Eliminar Todo
    private void btnelimiartodoActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        int fila=tabla.getRowCount();
        for (int i=fila-1; i>=0;i--){
            modelo.removeRow(i);
        }
        es.clear();
        en.clear();
    }                                              

    
    
    //En este fragemento de Codigo vamos a agregar eventos para el boton de eliminar un solo registro                   Eliminar Uno
    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int fila=tabla.getSelectedRow();
        if(fila >= 0){
            modelo.removeRow(fila);
            es.remove(fila);
            en.remove(fila);
        }else{
            JOptionPane.showMessageDialog(null,"Seleccione Una Fila");
        }
    }                                           

    
    //Aca agregamos los eventos al precionar el boton de agregar nueva palabra                                            Agregar
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        String Palabra = txt2.getText().toLowerCase();
        char caracter = Palabra.charAt(0);
        String cadena1 = Character.toString(caracter);
        String Palabra2 =  cadena1.toUpperCase()+Palabra.substring(1, Palabra.length()).toLowerCase();
        txt2.setText(Palabra2);
        
        String a= txt2.getText();
        String b= txt3.getText();
        //en esta partecita nos aprovechamos del arreglo para darle un indice de incremento a nuestro programa
        String cadena = String.valueOf(es.size()+1);
        //para Capturar el tipo de datoSystem.out.println(((Object)c).getClass().getSimpleName());

        if ("".equals(a) | "".equals(b)  ){
            JOptionPane.showMessageDialog(null,"Una o Varias Casillas estan Vacias");
        }else{
            String []info = new String[3];
            info[0]= cadena;
            info[1]= txt2.getText();
            es.add(txt2.getText());
            info[2]= txt3.getText();
            en.add(txt3.getText());
            modelo.addRow(info);

            txt2.setText("");
            txt3.setText("");
        }
    }                                    


//Aca Agregamos accion al boton para que limpie nuestra pantalla
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextArea1.setText("");
    }                                        

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {                                            
        // TODO add your handling code here:
        
        if (evt.getSource()==jComboBox1) {
            String seleccionado=(String)jComboBox1.getSelectedItem();
            if ("Basica".equals(seleccionado)){
                setSize(450,510);
            }
            if ("Avanzado".equals(seleccionado)){
                setSize(920,510);
            }
        }
    }                                           

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
       // AcercaDe ventana=new AcercaDe();
        //ventana.setVisible(true);
        Creditos ventana2=new Creditos();
        ventana2.setVisible(true);
        
    }                                        
  

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn1;
    private javax.swing.JButton btnelimiartodo;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabla;
    private javax.swing.JButton traducir;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txtdato;
    // End of variables declaration                   
}

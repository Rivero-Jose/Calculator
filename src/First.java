import javax.swing.JOptionPane;

public class First {
	Egg EG = new Egg();
	double sum[] = new double[1000000];
	double con[] = new double[1000000];
	int i = 0;
	int j = 0;
	double eqa = 0;
	public String in(String s){
		return JOptionPane.showInputDialog(s);
	}
	public void msg(String s){
		JOptionPane.showMessageDialog(null, s);
	}
	public double number() {
		String s = JOptionPane.showInputDialog("Enter number");
		double d = Double.parseDouble(s);
		return d;
	}
	public void home1(){
		if(sum[i]> sum.length){
			double a = sum[i];
			i = 0;
			for(int r = 0; r < sum.length; r++){
				sum[r]= 0;
			}
			sum[i] = a;
		}
		String s = in("This is the home screen\n" +
				"Current value " + sum[i] +
				"\nType in the letter on the screen to apply that method\n" +
				"a) Add   b) Subtract   c) Multiply   d) Divide   e) Modulus   f) pow.   g) Sq.rt.   h) Random num.(0 to 100)   i) Log   j) Log10\n" +
				"k) sin   l) cos   m) tan   n) sinh   o) cosh   p)tanh   q) toDegrees   r) toRadians   s) absolute value\n" +
				"t) csc   u) sec   v) cot\n" +
				"quit)   help)   converter)   equations)");
			if(s.equals("a")){
				add1(number(), number());
				home2();
			}else if(s.equals("b")){
				subtract1(number(),number());
				home2();
			}else if(s.equals("c")){
				multiply1(number(), number());
				home2();
			}else if(s.equals("d")){
				divide1(number(), number());
				home2();
			}else if(s.equals("e")){
				modulus1(number(), number());
				home2();
			}else if(s.equals("f")){
				pow1(number(), number());
				home2();
			}else if(s.equals("g")){
				sqrt1(number());
				home2();
			}else if(s.equals("h")){
				ran();
				home2();
			}else if(s.equals("i")){
				log1(number());
				home2();
			}else if(s.equals("j")){
				log101(number());
				home2();
			}else if(s.equals("k")){
				sin1(number());
				home2();
			}else if(s.equals("l")){
				cos1(number());
				home2();
			}else if(s.equals("m")){
				tan1(number());
				home2();
			}else if(s.equals("n")){
				sinh1(number());
				home2();
			}else if(s.equals("o")){
				cosh1(number());
				home2();
			}else if(s.equals("p")){
				tanh1(number());
				home2();
			}else if(s.equals("q")){
				degrees1(number());
				home2();
			}else if(s.equals("r")){
				radians1(number());
				home2();
			}else if(s.equals("s")){
				abs1(number());
				home2();
			}else if(s.equals("t")){
				csc1(number());
				home2();
			}else if(s.equals("u")){
				sec1(number());
				home2();
			}else if(s.equals("v")){
				cot1(number());
				home2();
			}else if(s.equals("quit")){
				
			}else if(s.equals("help")){
				String a =in("Type the letter that matchings the math function you want to you use.\n" +
						"Type in the full word to use different math functions [home] [equations]\n" +
						"Use clear to, clear the screen and you can enter new numbers\n" +
						"Use the chart if you don't know the abbrivations\n" +
						"use numbers so the calculator will work\n" +
						"Answer to life? (If you don't know it google it)");
					if(a.equals("42")){
						EG.runfinal();
					}
						home1();
			}else if(s.equals("equations")){
				sum[i] = 0;
				equations();
			}else if(s.equals("converter")){
				sum[i] = 0;
				convert1();
			}else{
				msg("Syntax Error");
				home1();
			}
	}
	public double add1(double x, double y){
		i++;
		return sum[i] = x + y;
	}
	public double subtract1(double x, double y){
		i++;
		return sum[i] = x - y;
	}
	public double multiply1(double x, double y){
		i++;
		return sum[i] = x * y;
	}
	public double divide1(double x, double y){
		i++;
		return sum[i] = x / y;
	}
	public double modulus1(double x, double y){
		i++;
		return sum[i] = x % y;
	}
	public double pow1(double x, double y){
		i++;
		return sum[i] = Math.pow(x, y);
	}
	public double sqrt1(double x){
		i++;
		return sum[i] = Math.sqrt(x);
	}
	public double log1(double x){
		i++;
		return sum[i] = Math.log(x);
	}
	public double log101(double x){
		i++;
		return sum[i] = Math.log10(x);
	}
	public double sin1(double x){
		i++;
		return sum[i] = Math.sin(x);
	}
	public double cos1(double x){
		i++;
		return sum[i] = Math.cos(x);
	}
	public double tan1(double x){
		i++;
		return sum[i] = Math.tan(x);
	}
	public double sinh1(double x){
		i++;
		return sum[i] = Math.sinh(x);
	}
	public double cosh1(double x){
		i++;
		return sum[i] = Math.cosh(x);
	}
	public double tanh1(double x){
		i++;
		return sum[i] = Math.tanh(x);
	}
	public double degrees1(double x){
		i++;
		return sum[i] = Math.toDegrees(x);
	}
	public double radians1(double x){
		i++;
		return sum[i] = Math.toRadians(x);
	}
	public double abs1(double x){
		i++;
		return sum[i] = Math.abs(x);
	}
	public double csc1(double x){
		i++;
		return sum[i] = 1/Math.sin(x);
	}
	public double sec1(double x){
		i++;
		return sum[i] = 1/Math.cos(x);
	}
	public double cot1(double x){
		i++;
		return sum[i] = 1/Math.tan(x);
	}
	public void convert1(){
		if(con[j]> con.length){
			double a = con[j];
			j = 0;
			for(int r = 0; r < con.length; r++){
				con[r]= 0;
			}
			con[i] = a;
		}
		String s = in("This is the conversions screen\n" +
				"Current value " + con[i] +
				"\nType in the letter on the screen to apply that method\n" +
				"a) in to cm   b) cm to in   c) m to in   d) in to m   e) ft to m   f) m to ft   g) yd to m   h) m to yd   i) mi to ft   j) ft to mi)\n" +
				"k) mi to yd   l) yd to mi   m) mi to km   n) km to mi   o) nmi to mi   p) mi to nmi   q) arce to m2   r) m2 to arce   s) lb to oz   t) oz to lb\n" +
				"u) lb to kg   v) kg to lb   w) ton to lb   x) lb to ton   y) cup to floz   z) floz to cup   aa) pint to cup   ab) cup to pint   ac) pint to qt   ad) qt to pint\n" +
				"ae) gal to qt   af) qt to gal   ag) gal to L   ah) L to gal   ai) L to ml   aj) ml to L   ak) L to cm3   al) cm3 to L   am) F to C   an) C to F\n" +
				"ao) J to cal   ap) cal to J   aq) C to K   ar) K to C   as)hp to kW   at)kW to hp   au)W to J   av)J to W   aw)atm to Pa   ax)Pa to atm   ay)Pa to mmHg   az)mmHg to Pa\n" +
				"ba) bit to byte   bb) byte to bit   bc) byte to kb   bd) kb to byte   be) kb to mb   bf) mb to kb   bg) mb to gb   bh) gb to mb   bi) gb to tb   bj) tb to gb\n" +
				"quit)   help)   chart)   equations)   home)");
		
				if(s.equals("a")){
					in2cm1(number());
					convert2();
				}else if(s.equals("b")){
					cm2in1(number());
					convert2();
				}else if(s.equals("c")){
					m2in1(number());
					convert2();
				}else if(s.equals("d")){
					in2m1(number());
					convert2();
				}else if(s.equals("e")){
					ft2m1(number());
					convert2();
				}else if(s.equals("f")){
					m2ft1(number());
					convert2();
				}else if(s.equals("g")){
					yd2m1(number());
					convert2();
				}else if(s.equals("h")){
					m2yd1(number());
					convert2();
				}else if(s.equals("i")){
					mi2ft1(number());
					convert2();
				}else if(s.equals("j")){
					ft2mi1(number());
					convert2();
				}else if(s.equals("k")){
					mi2yd1(number());
					convert2();
				}else if(s.equals("l")){
					yd2mi1(number());
					convert2();
				}else if(s.equals("m")){
					mi2km1(number());
					convert2();
				}else if(s.equals("n")){
					km2mi1(number());
					convert2();
				}else if(s.equals("o")){
					nmi2mi1(number());
					convert2();
				}else if(s.equals("p")){
					mi2nmi1(number());
					convert2();
				}else if(s.equals("q")){
					arce2m21(number());
					convert2();
				}else if(s.equals("r")){
					m22arce1(number());
					convert2();
				}else if(s.equals("s")){
					lb2oz1(number());
					convert2();
				}else if(s.equals("t")){
					oz2lb1(number());
					convert2();
				}else if(s.equals("u")){
					lb2kg1(number());
					convert2();
				}else if(s.equals("v")){
					kg2lb1(number());
					convert2();
				}else if(s.equals("w")){
					ton2lb1(number());
					convert2();
				}else if(s.equals("x")){
					lb2ton1(number());
					convert2();
				}else if(s.equals("y")){
					cup2floz1(number());
					convert2();
				}else if(s.equals("z")){
					floz2cup1(number());
					convert2();
				}else if(s.equals("aa")){
					pint2cup1(number());
					convert2();
				}else if(s.equals("ab")){
					cup2pint1(number());
					convert2();
				}else if(s.equals("ac")){
					pint2qt1(number());
					convert2();
				}else if(s.equals("ad")){
					qt2pint1(number());
					convert2();
				}else if(s.equals("ae")){
					ga2qt1(number());
					convert2();
				}else if(s.equals("af")){
					qt2ga1(number());
					convert2();
				}else if(s.equals("ag")){
					ga2L1(number());
					convert2();
				}else if(s.equals("ah")){
					L2ga1(number());
					convert2();
				}else if(s.equals("ai")){
					L2ml1(number());
					convert2();
				}else if(s.equals("aj")){
					ml2L1(number());
					convert2();
				}else if(s.equals("ak")){
					L2cm31(number());
					convert2();
				}else if(s.equals("al")){
					cm32L1(number());
					convert2();
				}else if(s.equals("am")){
					F2C1(number());
					convert2();
				}else if(s.equals("an")){
					C2F1(number());
					convert2();
				}else if(s.equals("ao")){
					J2cal1(number());
					convert2();
				}else if(s.equals("ap")){
					cal2J1(number());
					convert2();
				}else if(s.equals("aq")){
					C2K1(number());
					convert2();
				}else if(s.equals("ar")){
					K2C1(number());
					convert2();
				}else if(s.equals("as")){
					hp2kW1(number());
					convert2();
				}else if(s.equals("at")){
					kW2hp1(number());
					convert2();
				}else if(s.equals("au")){
					W2J1(number());
					convert2();
				}else if(s.equals("av")){
					J2W1(number());
					convert2();
				}else if(s.equals("aw")){
					atm2Pa1(number());
					convert2();
				}else if(s.equals("ax")){
					Pa2atm1(number());
					convert2();
				}else if(s.equals("ay")){
					Pa2mmHg1(number());
					convert2();
				}else if(s.equals("az")){
					mmHg2Pa1(number());
					convert2();
				}else if(s.equals("ba")){
					bit2byte1(number());
					convert2();
				}else if(s.equals("bb")){
					byte2bit1(number());
					convert2();
				}else if(s.equals("bc")){
					byte2kb1(number());
					convert2();
				}else if(s.equals("bd")){
					kb2byte1(number());
					convert2();
				}else if(s.equals("be")){
					kb2mb1(number());
					convert2();
				}else if(s.equals("bf")){
					mb2kb1(number());
					convert2();
				}else if(s.equals("bg")){
					mb2gb1(number());
					convert2();
				}else if(s.equals("bh")){
					gb2mb1(number());
					convert2();
				}else if(s.equals("bi")){
					gb2tb1(number());
					convert2();
				}else if(s.equals("bj")){
					tb2gb1(number());
					convert2();
				}else if(s.equals("quit")){
					
					
				}else if(s.equals("help")){
					String a =in("Type the letter that matchings the math function you want to you use.\n" +
						"Type in the full word to use different math functions [home] [equations]\n" +
						"Use clear to, clear the screen and you can enter new numbers\n" +
						"Use the chart if you don't know the abbrivations\n" +
						"use numbers so the calculator will work\n" +
						"Answer to life? (If you don't know it google it)");
					if(a.equals("42")){
						EG.runfinal();
					}
						convert1();
			}else if(s.equals("chart")){
			msg("in- inches   cm- centimeters   m- meters   ft- feet   yd- yard   mi- mile   km- kilometer   nmi- natuical mile   acre- acre   m2- meters squared\n" +
					"lb- pounds   kg- kilograms   ton- tons\n" +
					"cup- cups   floz- fluid ounces   pint- pints   qt- guarts   gal- gallon   L- Liters   ml- milliliters   cm3- centimeters cubed\n" +
					"F- Fahrenhiet   C- Celsius   K- Kelvin   J- Joules   cal- calories\n" +
					"Pa - Pascal   atm- atmosphere   mmHg - millilieter of Mercury\n" +
					"hp- british horsepower   kW- kilowatt W- Watt\n" +
					"bit- bit   byte- byte   kb- kilobyte   mb- megabyte   gb- gigabyte   tb- tetrabyte");
			convert1();
		}else if(s.equals("equations")){
		
			con[j] = 0;
			equations();
		}else if(s.equals("home")){
			con[j] = 0;
			home1();
		}else{
			msg("Syntax Error");
			convert1();
		}
	}
	public double in2cm1(double x){
		j++;
		return con[j] = (double)x*2.54;
	}
	public double cm2in1(double x){
		j++;
		return con[j] = (double)x/2.54;
	}
	public double m2in1(double x){
		j++;
		return con[j] = (double)x*39.97;
	}
	public double in2m1(double x){
		j++;
		return con[j] = (double)x/39.97;
	}
	public double ft2m1(double x){
		j++;
		return con[j] = (double)x*0.3048;
	}
	public double m2ft1(double x){
		j++;
		return con[j] = (double)x/0.3048;
	}
	public double yd2m1(double x){
		j++;
		return con[j] = (double)x*0.9144;
	}
	public double m2yd1(double x){
		j++;
		return con[j] = (double)x/0.9144;
	}
	public double mi2ft1(double x){
		j++;
		return con[j] = (double)x*5280;
	}
	public double ft2mi1(double x){
		j++;
		return con[j] = (double)x/5280;
	}
	public double mi2yd1(double x){
		j++;
		return con[j] = (double)x*1760;
	}
	public double yd2mi1(double x){
		j++;
		return con[j] = (double)x/1760;
	}
	public double mi2km1(double x){
		j++;
		return con[j] = (double)x*1.609;
	}
	public double km2mi1(double x){
		j++;
		return con[j] = (double)x*0.62;
	}
	public double nmi2mi1(double x){
		j++;
		return con[j]= (double)x*1852;
	}
	public double mi2nmi1(double x){
		j++;
		return con[j] = (double)x/1852;
	}
	public double arce2m21(double x){
		j++;
		return con[j] = (double)x*4046.856;
	}
	public double m22arce1(double x){
		j++;
		return con[j] = (double)x/4046.856;
	}
	public double lb2oz1(double x){
		j++;
		return con[j] = (double)x*16;
	}
	public double oz2lb1(double x){
		j++;
		return con[j] = (double)x/16;
	}
	public double lb2kg1(double x){
		j++;
		return con[j] = (double)x*0.454;
	}
	public double kg2lb1(double x){
		j++;
		return con[j] = (double)x*2.2;
	}
	public double ton2lb1(double x){
		j++;
		return con[j] = (double)x*2000;
	}
	public double lb2ton1(double x){
		j++;
		return con[j] = (double)x/2000;
	}
	public double cup2floz1(double x){
		j++;
		return con[j] = (double)x*8;
	}
	public double floz2cup1(double x){
		j++;
		return con[j] = (double)x/8;
	}
	public double pint2cup1(double x){
		j++;
		return con[j] = (double)x*2;
	}
	public double cup2pint1(double x){
		j++;
		return con[j]= (double)x/2;
	}
	public double pint2qt1(double x){
		j++;
		return con[j] = (double)x/2;
	}
	public double qt2pint1(double x){
		j++;
		return con[j] = (double)x*2;
	}
	public double ga2qt1(double x){
		j++;
		return con[j] = (double)x*4;
	}
	public double qt2ga1(double x){
		j++;
		return con[j] = (double)x/4;
	}
	public double ga2L1(double x){
		j++;
		return con[j]= (double)x*3.785;
	}
	public double L2ga1(double x){
		j++;
		return con[j] = (double)x*0.264;
	}
	public double L2ml1(double x){
		j++;
		return con[j] = (double)x*1000;
	}
	public double ml2L1(double x){
		j++;
		return con[j] = (double)x/1000;
	}
	public double L2cm31(double x){
		j++;
		return con[j] = (double)x*1000;
	}
	public double cm32L1(double x){
		j++;
		return con[j] = (double)x/1000;
	}
	public double F2C1(double x){
		j++;
		return con[j] = (double)x*(-17.22222222222222222);
	}
	public double C2F1(double x){
		j++;
		return con[j] = (double)x*33.8;
	}
	public double J2cal1(double x){
		j++;
		return con[j] = (double)x*(0.2389029576);
	}
	public double cal2J1(double x){
		j++;
		return con[j] = (double)x*4.1858;
	}
	public double C2K1(double x){
		j++;
		return con[j] = (double)x+273;
	}
	public double K2C1(double x){
		j++;
		return con[j] = (double)x-273;
	}
	public double hp2kW1(double x){
		j++;
		return con[j] = (double)x*0.746;
	}
	public double kW2hp1(double x){
		j++;
		return con[j] = (double)x/0.746;
	}
	public double W2J1(double x){
		j++;
		return con[j] = (double)x*3600;
	}
	public double J2W1(double x){
		j++;
		return con[j] = (double)x/3600;
	}
	public double atm2Pa1(double x){
		j++;
		return con[j] = (double)x*101325;
	}
	public double Pa2atm1(double x){
		j++;
		return con[j] = (double)x/101325;
	}
	public double Pa2mmHg1(double x){
		j++;
		return con[j] = (double)x/133.3224;
	}
	public double mmHg2Pa1(double x){
		j++;
		return con[j] = (double)x*133.3224;
	}
	public double bit2byte1(double x){
		j++;
		return con[j] = (double)x/8;
	}
	public double byte2bit1(double x){
		j++;
		return con[j] = (double)x*8;
	}
	public double byte2kb1(double x){
		j++;
		return con[j] = (double)x*0.001;
	}
	public double kb2byte1(double x){
		j++;
		return con[j] = (double)x/0.001;
	}
	public double kb2mb1(double x){
		j++;
		return con[j] = (double)x/1000;
	}
	public double mb2kb1(double x){
		j++;
		return con[j] = (double)x*1000;
	}
	public double mb2gb1(double x){
		j++;
		return con[j] = (double)x/1000;
	}
	public double gb2mb1(double x){
		j++;
		return con[j] = (double)x*1000;
	}
	public double gb2tb1(double x){
		j++;
		return con[j] = (double)x/1000;
	}
	public double tb2gb1(double x){
		j++;
		return con[j] = (double)x*1000;
	}
	public double ran(){
		i++;
		return sum[i-1] = Math.random()*100;
	}
	public void equations(){
		String s = in("This is the equations screen\n" +
				"Current value " + eqa +
				"\nType in the letter on the screen to apply that method\n" +
				"a) Slope   b) TriangleArea   c) Rect/Sq/ParallelogramsArea   d) CircleArea e) Circumference   f) PrismVolume\n" +
				"g) CylinderVolume   h) SphereVolume   i)ConeVolume   j)PyramidVolume\n" +
				"k)QuadraticFormula(PositiveAnswer) l)QuadraticFormula(NegativeAnswer) m)ProbabilityFormula\n" +
				"quit)   help)   converter)   home)");
		if(s.equals("a")){
			msg("Enter yf first then yi \n" +
					"Followed by xf then xi");
			slope(number(),number(),number(),number());
			equations();
		}else if(s.equals("b")){
			msg("Enter base and height");
			triArea(number(),number());
			equations();
		}else if(s.equals("c")){
			msg("Enter base and height");
			rectArea(number(),number());
			equations();
		}else if(s.equals("d")){
			msg("Enter the radius");
			cirArea(number());
			equations();
		}else if(s.equals("e")){
			msg("Enter the radius");
			circum(number());
			equations();
		}else if(s.equals("f")){
			msg("Enter the Length, width, and height");
			prism(number(),number(),number());
			equations();
		}else if(s.equals("g")){
			msg("Enter radius first, then height");
			cylinder(number(),number());
			equations();
		}else if(s.equals("h")){
			msg("Enter the radius");
			sphere(number());
			equations();
		}else if(s.equals("i")){
			msg("Enter radius first, then height");
			cone(number(),number());
			equations();
		}else if(s.equals("j")){
			msg("Enter the length, width, and height");
			pyramid(number(),number(),number());
			equations();
		}else if(s.equals("k")){
			msg("Enter value of a first \n" +
					"Enter value of b second\n" +
					"Enter value of c last");
			quadraticP(number(),number(),number());
			equations();
		}else if(s.equals("l")){
			msg("Enter value of a first \n" +
					"Enter value of b second\n" +
					"Enter value of c last");
			quadraticN(number(),number(),number());
			equations();
		}else if(s.equals("m")){
			msg("Enter th value of x first\n" +
					"Then the value of the mean\n" +
					"Last enter the value of the standard deviation\n" +
					"This gives you the z values needed");
			prob(number(),number(),number());
			equations();
		}else if(s.equals("quit")){
			
		}else if(s.equals("help")){
				String a =in("Type the letter that matchings the math function you want to you use.\n" +
					"Type in the full word to use different math functions [home] [equations]\n" +
					"Use clear to, clear the screen and you can enter new numbers\n" +
					"Use the chart if you don't know the abbrivations\n" +
					"use numbers so the calculator will work\n" +
					"Answer to life? (If you don't know it google it)");
				if(a.equals("42")){
					EG.runfinal();
				}
					equations();
		}else if(s.equals("converter")){
			eqa = 0;
			convert1();
		}else if(s.equals("home")){
			eqa = 0;
			home1();
		}else{
			msg("Syntax Error");
			equations();
		}
	}
	public double slope(double w, double x, double y, double z){
		return eqa = (double)(w - x)/(double)(y - z);
	}
	public double triArea(double x, double y){
		return eqa = ((double)x*(double)y)/2;
	}
	public double rectArea(double x, double y){
		return eqa = (double)x*(double)y;
	}
	public double cirArea(double x){
		return eqa = (double)(Math.PI)*(double)(Math.pow(x, 2));
	}
	public double circum(double x){
		return eqa = (double)2*(double)(Math.PI)*x;
	}
	public double prism(double x, double y, double z){
		return eqa = (double)x*y*z;
	}
	public double cylinder(double x, double y){
		return eqa = (double)(Math.PI)*(double)(Math.pow(x, 2)*y);
	}
	public double sphere(double x){
		return eqa = (double)(1.333333333333333)*(double)(Math.PI)*(double)(Math.pow(x, 3));
	}
	public double cone(double x, double y){
		return eqa = (double)(0.333333333333333)*(double)(Math.PI)*(double)(Math.pow(x, 2)*y);
	}
	public double pyramid(double x, double y, double z){
		return eqa = (double)(0.333333333333333)*(double)x*(double)y*(double)z;
	}
	public double quadraticP(double x, double y, double z){
		double a = -4*x*z;
		double b = Math.pow(y, 2);
		double c = 2*x;
		double d = -y;
		double e = Math.sqrt(b+a);
		double f = d+e;
		double g = f/c;
		return eqa = g;
	}
	public double quadraticN(double x, double y, double z){
		double a = -4*x*z;
		double b = Math.pow(y, 2);
		double c = 2*x;
		double d = -y;
		double e = Math.sqrt(b+a);
		double f = d-e;
		double g = f/c;
		return eqa = g;
	}
	public double prob(double x, double y, double z){
		return eqa = (double)(x-y)/(double)z;
	}
	public void home2(){
		if(sum[i]> sum.length){
			double a = sum[i];
			i = 0;
			for(int r = 0; r < sum.length; r++){
				sum[r]= 0;
			}
			sum[i] = a;
		}
		String s = in("This is the home screen\n" +
				"Current value " + sum[i] +
				"\nType in the letter on the screen to apply that method\n" +
				"a) Add   b) Subtract   c) Multiply   d) Divide   e) Modulus   f) pow.   g) Sq.rt.   h) Random num.(0 to 100)   i) Log   j) Log10\n" +
				"k) sin   l) cos   m) tan   n) sinh   o) cosh   p)tanh   q) toDegrees   r) toRadians   s) absolute value\n" +
				"t) csc   u) sec   v) cot\n" +
				"quit)   help)   clear)   converter)   equations)");
			if(s.equals("a")){
				add2(number());
				home2();
			}else if(s.equals("b")){
				subtract2(number());
				home2();
			}else if(s.equals("c")){
				multiply2(number());
				home2();
			}else if(s.equals("d")){
				divide2(number());
				home2();
			}else if(s.equals("e")){
				modulus2(number());
				home2();
			}else if(s.equals("f")){
				pow2(number());
				home2();
			}else if(s.equals("g")){
				sqrt2();
				home2();
			}else if(s.equals("h")){
				ran();
				home2();
			}else if(s.equals("i")){
				log2();
				home2();
			}else if(s.equals("j")){
				log102();
				home2();
			}else if(s.equals("k")){
				sin2();
				home2();
			}else if(s.equals("l")){
				cos2();
				home2();
			}else if(s.equals("m")){
				tan2();
				home2();
			}else if(s.equals("n")){
				sinh2();
				home2();
			}else if(s.equals("o")){
				cosh2();
				home2();
			}else if(s.equals("p")){
				tanh2();
				home2();
			}else if(s.equals("q")){
				degrees2();
				home2();
			}else if(s.equals("r")){
				radians2();
				home2();
			}else if(s.equals("s")){
				abs2();
				home2();
			}else if(s.equals("t")){
				csc2();
				home2();
			}else if(s.equals("u")){
				sec2();
				home2();
			}else if(s.equals("v")){
				cot2();
				home2();
			}else if(s.equals("quit")){
				
			}else if(s.equals("help")){
				String a =in("Type the letter that matchings the math function you want to you use.\n" +
						"Type in the full word to use different math functions [home] [equations]\n" +
						"Use clear to, clear the screen and you can enter new numbers\n" +
						"Use the chart if you don't know the abbrivations\n" +
						"use numbers so the calculator will work\n" +
						"Answer to life? (If you don't know it google it)");
				if(a.equals("42")){
					sum[i] = 0;
					EG.runfinal();
				}
						home2();
			}else if(s.equals("equations")){
				sum[i] = 0;
				equations();
			}else if(s.equals("converter")){
				sum[i] = 0;
				convert1();
			}else if(s.equals("clear")){
				clearhome();
			}else{
				msg("Syntax Error");
				home2();
			}
	}
	public double add2(double x){
		i++;
		return sum[i] = sum[i-1]+ x;
	}
	public double subtract2(double x){
		i++;
		return sum[i] = sum[i-1]-x;
	}
	public double multiply2(double x){
		i++;
		return sum[i] = sum[i-1]*x;
	}
	public double divide2(double x){
		i++;
		return sum[i] = sum[i-1]/ x;
	}
	public double modulus2(double x){
		i++;
		return sum[i] = sum[i-1]%x;
	}
	public double pow2(double x){
		i++;
		return sum[i] = Math.pow(sum[i-1], x);
	}
	public double sqrt2(){
		i++;
		return sum[i] = Math.sqrt(sum[i-1]);
	}
	public double log2(){
		i++;
		return sum[i] = Math.log(sum[i-1]);
	}
	public double log102(){
		i++;
		return sum[i] = Math.log10(sum[i-1]);
	}
	public double sin2(){
		i++;
		return sum[i] = Math.sin(sum[i-1]);
	}
	public double cos2(){
		i++;
		return sum[i] = Math.cos(sum[i-1]);
	}
	public double tan2(){
		i++;
		return sum[i] = Math.tan(sum[i-1]);
	}
	public double sinh2(){
		i++;
		return sum[i] = Math.sinh(sum[i-1]);
	}
	public double cosh2(){
		i++;
		return sum[i] = Math.cosh(sum[i-1]);
	}
	public double tanh2(){
		i++;
		return sum[i]= Math.tanh(sum[i-1]);
	}
	public double degrees2(){
		i++;
		return sum[i] = Math.toDegrees(sum[i-1]);
	}
	public double radians2(){
		i++;
		return sum[i] = Math.toRadians(sum[i-1]);
	}
	public double abs2(){
		i++;
		return sum[i] = Math.abs(sum[i-1]);
	}
	public double csc2(){
		i++;
		return sum[i] = 1/Math.sin(sum[i-1]);
	}
	public double sec2(){
		i++;
		return sum[i] = 1/Math.cos(sum[i-1]);
	}
	public double cot2(){
		i++;
		return sum[i] = 1/Math.tan(sum[i-1]);
	}
	public void convert2(){
		if(con[j]> con.length){
			double a = con[j];
			j = 0;
			for(int r = 0; r < con.length; r++){
				con[r]= 0;
			}
			con[i] = a;
		}
		String s = in("This is the conversions screen\n" +
				"Current value " + con[j] +
				"\nType in the letter on the screen to apply that method\n" +
				"a) in to cm   b) cm to in   c) m to in   d) in to m   e) ft to m   f) m to ft   g) yd to m   h) m to yd   i) mi to ft   j) ft to mi)\n" +
				"k) mi to yd   l) yd to mi   m) mi to km   n) km to mi   o) nmi to mi   p) mi to nmi   q) arce to m2   r) m2 to arce   s) lb to oz   t) oz to lb\n" +
				"u) lb to kg   v) kg to lb   w) ton to lb   x) lb to ton   y) cup to floz   z) floz to cup   aa) pint to cup   ab) cup to pint   ac) pint to qt   ad) qt to pint\n" +
				"ae) gal to qt   af) qt to gal   ag) gal to L   ah) L to gal   ai) L to ml   aj) ml to L   ak) L to cm3   al) cm3 to L   am) F to C   an) C to F\n" +
				"ao) J to cal   ap) cal to J   aq) C to K   ar) K to C   as)hp to kW   at)kW to hp   au)W to J   av)J to W   aw)atm to Pa   ax)Pa to atm   ay)Pa to mmHg   az)mmHg to Pa\n" +
				"ba) bit to byte   bb) byte to bit   bc) byte to kb   bd) kb to byte   be) kb to mb   bf) mb to kb   bg) mb to gb   bh) gb to mb   bi) gb to tb   bj) tb to gb\n" +
				"quit)   help)   chart)   clear)   equations)   home)");
		if(s.equals("a")){
			in2cm2();
			convert2();
		}else if(s.equals("b")){
			cm2in2();
			convert2();
		}else if(s.equals("c")){
			m2in2();
			convert2();
		}else if(s.equals("d")){
			in2m2();
			convert2();
		}else if(s.equals("e")){
			ft2m2();
			convert2();
		}else if(s.equals("f")){
			m2ft2();
			convert2();
		}else if(s.equals("g")){
			yd2m2();
			convert2();
		}else if(s.equals("h")){
			m2yd2();
			convert2();
		}else if(s.equals("i")){
			mi2ft2();
			convert2();
		}else if(s.equals("j")){
			ft2mi2();
			convert2();
		}else if(s.equals("k")){
			mi2yd2();
			convert2();
		}else if(s.equals("l")){
			yd2mi2();
			convert2();
		}else if(s.equals("m")){
			mi2km2();
			convert2();
		}else if(s.equals("n")){
			km2mi2();
			convert2();
		}else if(s.equals("o")){
			nmi2mi2();
			convert2();
		}else if(s.equals("p")){
			mi2nmi2();
			convert2();
		}else if(s.equals("q")){
			arce2m22();
			convert2();
		}else if(s.equals("r")){
			m22arce2();
			convert2();
		}else if(s.equals("s")){
			lb2oz2();
			convert2();
		}else if(s.equals("t")){
			oz2lb2();
			convert2();
		}else if(s.equals("u")){
			lb2kg2();
			convert2();
		}else if(s.equals("v")){
			kg2lb2();
			convert2();
		}else if(s.equals("w")){
			ton2lb2();
			convert2();
		}else if(s.equals("x")){
			lb2ton2();
			convert2();
		}else if(s.equals("y")){
			cup2floz2();
			convert2();
		}else if(s.equals("z")){
			floz2cup2();
			convert2();
		}else if(s.equals("aa")){
			pint2cup2();
			convert2();
		}else if(s.equals("ab")){
			cup2pint2();
			convert2();
		}else if(s.equals("ac")){
			pint2qt2();
			convert2();
		}else if(s.equals("ad")){
			qt2pint2();
			convert2();
		}else if(s.equals("ae")){
			ga2qt2();
			convert2();
		}else if(s.equals("af")){
			qt2ga2();
			convert2();
		}else if(s.equals("ag")){
			ga2L2();
			convert2();
		}else if(s.equals("ah")){
			L2ga2();
			convert2();
		}else if(s.equals("ai")){
			L2ml2();
			convert2();
		}else if(s.equals("aj")){
			ml2L2();
			convert2();
		}else if(s.equals("ak")){
			L2cm32();
			convert2();
		}else if(s.equals("al")){
			cm32L2();
			convert2();
		}else if(s.equals("am")){
			F2C2();
			convert2();
		}else if(s.equals("an")){
			C2F2();
			convert2();
		}else if(s.equals("ao")){
			J2cal2();
			convert2();
		}else if(s.equals("ap")){
			cal2J2();
			convert2();
		}else if(s.equals("aq")){
			C2K2();
			convert2();
		}else if(s.equals("ar")){
			K2C2();
			convert2();
		}else if(s.equals("as")){
			hp2kW2();
			convert2();
		}else if(s.equals("at")){
			kW2hp2();
			convert2();
		}else if(s.equals("au")){
			W2J2();
			convert2();
		}else if(s.equals("av")){
			J2W2();
			convert2();
		}else if(s.equals("aw")){
			atm2Pa2();
			convert2();
		}else if(s.equals("ax")){
			Pa2atm2();
			convert2();
		}else if(s.equals("ay")){
			Pa2mmHg2();
			convert2();
		}else if(s.equals("az")){
			mmHg2Pa2();
			convert2();
		}else if(s.equals("ba")){
			bit2byte2();
			convert2();
		}else if(s.equals("bb")){
			byte2bit2();
			convert2();
		}else if(s.equals("bc")){
			byte2kb2();
			convert2();
		}else if(s.equals("bd")){
			kb2byte2();
			convert2();
		}else if(s.equals("be")){
			kb2mb2();
			convert2();
		}else if(s.equals("bf")){
			mb2kb2();
			convert2();
		}else if(s.equals("bg")){
			mb2gb2();
			convert2();
		}else if(s.equals("bh")){
			gb2mb2();
			convert2();
		}else if(s.equals("bi")){
			gb2tb2();
			convert2();
		}else if(s.equals("bj")){
			tb2gb2();
			convert2();
		}else if(s.equals("quit")){
					
		}else if(s.equals("help")){
				String a =in("Type the letter that matchings the math function you want to you use.\n" +
					"Type in the full word to use different math functions [home] [equations]\n" +
					"Use clear to, clear the screen and you can enter new numbers\n" +
					"Use the chart if you don't know the abbrivations\n" +
					"use numbers so the calculator will work\n" +
					"Answer to life? (If you don't know it google it)");
				if(a.equals("42")){
					con[j] = 0;
					EG.runfinal();
				}
					convert2();
		}else if(s.equals("equations")){
			con[j] = 0;
			equations();
		}else if(s.equals("home")){
			con[j] = 0;
			home1();
		}else if(s.equals("clear")){
			clearcon();
		}else if(s.equals("chart")){
			msg("in- inches   cm- centimeters   m- meters   ft- feet   yd- yard   mi- mile   km- kilometer   nmi- natuical mile   acre- acre   m2- meters squared\n" +
					"lb- pounds   kg- kilograms   ton- tons\n" +
					"cup- cups   floz- fluid ounces   pint- pints   qt- guarts   gal- gallon   L- Liters   ml- milliliters   cm3- centimeters cubed\n" +
					"F- Fahrenhiet   C- Celsius   K- Kelvin   J- Joules   cal- calories\n" +
					"Pa - Pascal   atm- atmosphere   mmHg - millilieter of Mercury\n" +
					"hp- british horsepower   kW- kilowatt W- Watt\n" +
					"bit- bit   byte- byte   kb- kilobyte   mb- megabyte   gb- gigabyte   tb- tetrabyte");
			convert2();
		}else{
			msg("Syntax Error");
			convert2();
		}
	}
	public double in2cm2(){
		j++;
		return con[j] = (double)con[j-1]*2.54;
	}
	public double cm2in2(){
		j++;
		return con[j-1] = (double)con[j-1]/2.54;
	}
	public double m2in2(){
		j++;
		return con[j] = (double)con[j-1]*39.97;
	}
	public double in2m2(){
		j++;
		return con[j] = (double)con[j-1]/39.97;
	}
	public double ft2m2(){
		j++;
		return con[j] = (double)con[j-1]*0.3048;
	}
	public double m2ft2(){
		j++;
		return con[j] = (double)con[j-1]/0.3048;
	}
	public double yd2m2(){
		j++;
		return con[j] = (double)con[j-1]*0.9144;
	}
	public double m2yd2(){
		j++;
		return con[j] = (double)con[j-1]/0.9144;
	}
	public double mi2ft2(){
		j++;
		return con[j] = (double)con[j-1]*5280;
	}
	public double ft2mi2(){
		j++;
		return con[j] = (double)con[j-1]/5280;
	}
	public double mi2yd2(){
		j++;
		return con[j] = (double)con[j-1]*1760;
	}
	public double yd2mi2(){
		j++;
		return con[j] = (double)con[j-1]/1760;
	}
	public double mi2km2(){
		j++;
		return con[j] = (double)con[j-1]*1.609;
	}
	public double km2mi2(){
		j++;
		return con[j] = (double)con[j-1]*0.62;
	}
	public double nmi2mi2(){
		j++;
		return con[j] = (double)con[j-1]*1852;
	}
	public double mi2nmi2(){
		j++;
		return con[j] = (double)con[j-1]/1852;
	}
	public double arce2m22(){
		j++;
		return con[j] = (double)con[j-1]*4046.856;
	}
	public double m22arce2(){
		j++;
		return con[j] = (double)con[j-1]/4046.856;
	}
	public double lb2oz2(){
		j++;
		return con[j] = (double)con[j-1]*16;
	}
	public double oz2lb2(){
		j++;
		return con[j] = (double)con[j-1]/16;
	}
	public double lb2kg2(){
		j++;
		return con[j] = (double)con[j-1]*0.454;
	}
	public double kg2lb2(){
		j++;
		return con[j] = (double)con[j-1]*2.2;
	}
	public double ton2lb2(){
		j++;
		return con[j] = (double)con[j-1]*2000;
	}
	public double lb2ton2(){
		j++;
		return con[j] = (double)con[j-1]/2000;
	}
	public double cup2floz2(){
		j++;
		return con[j] = (double)con[j-1]*8;
	}
	public double floz2cup2(){
		j++;
		return con[j] = (double)con[j-1]/8;
	}
	public double pint2cup2(){
		j++;
		return con[j] = (double)con[j-1]*2;
	}
	public double cup2pint2(){
		j++;
		return con[j] = (double)con[j-1]/2;
	}
	public double pint2qt2(){
		j++;
		return con[j] = (double)con[j-1]/2;
	}
	public double qt2pint2(){
		j++;
		return con[j] = (double)con[j-1]*2;
	}
	public double ga2qt2(){
		j++;
		return con[j] = (double)con[j-1]*4;
	}
	public double qt2ga2(){
		j++;
		return con[j] = (double)con[j-1]/4;
	}
	public double ga2L2(){
		j++;
		return con[j] = (double)con[j-1]*3.785;
	}
	public double L2ga2(){
		j++;
		return con[j] = (double)con[j-1]*0.264;
	}
	public double L2ml2(){
		j++;
		return con[j] = (double)con[j-1]*1000;
	}
	public double ml2L2(){
		j++;
		return con[j] = (double)con[j-1]/1000;
	}
	public double L2cm32(){
		j++;
		return con[j] = (double)con[j-1]*1000;
	}
	public double cm32L2(){
		j++;
		return con[j] = (double)con[j-1]/1000;
	}
	public double F2C2(){
		j++;
		return con[j] = (double)con[j-1]*(-17.22222222222222222);
	}
	public double C2F2(){
		j++;
		return con[j] = (double)con[j-1]*33.8;
	}
	public double J2cal2(){
		j++;
		return con[j] = (double)con[j-1]*(0.2389029576);
	}
	public double cal2J2(){
		j++;
		return con[j] = (double)con[j-1]*4.1858;
	}
	public double C2K2(){
		j++;
		return con[j] = (double)con[j-1]+273;
	}
	public double K2C2(){
		j++;
		return con[j] = (double)con[j-1]-273;
	}
	public double hp2kW2(){
		j++;
		return con[j] = (double)con[j-1]*0.746;
	}
	public double kW2hp2(){
		j++;
		return con[j] = (double)con[j-1]/0.746;
	}
	public double W2J2(){
		j++;
		return con[j] = (double)con[j-1]*3600;
	}
	public double J2W2(){
		j++;
		return con[j] = (double)con[j-1]/3600;
	}
	public double atm2Pa2(){
		j++;
		return con[j] = (double)con[j-1]*101325;
	}
	public double Pa2atm2(){
		j++;
		return con[j] = (double)con[j-1]/101325;
	}
	public double Pa2mmHg2(){
		j++;
		return con[j] = (double)con[j-1]/133.3224;
	}
	public double mmHg2Pa2(){
		j++;
		return con[j] = (double)con[j-1]*133.3224;
	}
	public double bit2byte2(){
		j++;
		return con[j] = (double)con[j-1]/8;
	}
	public double byte2bit2(){
		j++;
		return con[j] = (double)con[j-1]*8;
	}
	public double byte2kb2(){
		j++;
		return con[j] = (double)con[j-1]*0.001;
	}
	public double kb2byte2(){
		j++;
		return con[j] = (double)con[j-1]/0.001;
	}
	public double kb2mb2(){
		j++;
		return con[j] = (double)con[j-1]/1000;
	}
	public double mb2kb2(){
		j++;
		return con[j] = (double)con[j-1]*1000;
	}
	public double mb2gb2(){
		j++;
		return con[j] = (double)con[j-1]/1000;
	}
	public double gb2mb2(){
		j++;
		return con[j] = (double)con[j-1]*1000;
	}
	public double gb2tb2(){
		j++;
		return con[j] = (double)con[j-1]/1000;
	}
	public double tb2gb2(){
		j++;
		return con[j] = (double)con[j-1]*1000;
	}
	public void clearcon(){
		con[j] = 0;
		convert1();
	}
	public void clearhome(){
		sum[i] = 0;
		home1();
		
	}
}
/*why would you do this to yourself
			-Christina */

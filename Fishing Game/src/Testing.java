import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Testing extends JFrame
	{
		private static final long serialVersionUID = 1L;
		static JFrame frame = new JFrame();
		static int areaChoice;
		public static void main(String[] args)
			{
				Object[] options = {"The Amazon River", "Hawaii", "The Great Barrier Reef"};
				areaChoice = JOptionPane.showOptionDialog(frame, "Where would you like to fish?",
						"Your Area",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, options, options[2]);
				switch(areaChoice)
				{
				case 0:
					{
					JOptionPane.showMessageDialog(frame, "The Amazing River eh? Not too difficult but watch out for the Pirhanas!!!");
					doAmazonRiver();
					break;
					}
				case 1:
					{
					JOptionPane.showMessageDialog(frame, "Probably the most beautiful place to go fishing! Let's go!!!");
					break;
					doHawaii();
					}
				case 2:
					{
					JOptionPane.showMessageDialog(frame, "The fish here are real big! Prepare yourself...");
					break;
					doTheGreatBarrierReef();
					}
				}

			}

	}

/*

 Audiometria
 Version 0.1
 
 Audiometry: hearing test, equal loudness contours (hearing thresholds), 
 sensitivity and acuity.
 
 Warning 1:
 Start with the master sound low!
    Loud sounds can hurt or damage your ears.
    I do not give any warranty nor take any responsibility about any bad usage
        of this software.
 
 
 Warning 2:
 This test does not, in any manner, substitute a doctor!
    This software is for informational purposes only.
    You can use to compare your left and right ears or to equalize your computer.
    The spectral purity and the sound level depend on your sound card and 
        headphones.
    Daily fluctuations in hearing are common.
    If you are worried about your listening, consult an audiologist.

 
 Copyright © 2012 Marcos Assis
 (except when mentioned)
 
 This program is free software: you can redistribute it and/or modify it under 
 the terms of the GNU General Public License as published by the Free Software 
 Foundation, either version 3 of the License, or (at your option) any later
 version. 
 
 This program is distributed in the hope that it will be useful, but WITHOUT ANY
 WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 PARTICULAR PURPOSE.  See the GNU General Public License for more details. 
 
 You should have received a copy of the GNU General Public License along with
 this program.  If not, see http://www.gnu.org/licenses.

*/
package util;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author marcos
 */
public class JFileChooserWithConfirmation extends JFileChooser {

    @Override
    public void approveSelection() {
        File f = getSelectedFile();
        if (f.exists() && getDialogType() == SAVE_DIALOG) {
            int result = JOptionPane.showConfirmDialog(this, "The file exists, overwrite?", "Existing file", JOptionPane.YES_NO_CANCEL_OPTION);
            switch (result) {
                case JOptionPane.YES_OPTION:
                    super.approveSelection();
                    return;
                case JOptionPane.NO_OPTION:
                    return;
                case JOptionPane.CANCEL_OPTION:
                    cancelSelection();
                    return;
            }
        }
        super.approveSelection();
    }
}

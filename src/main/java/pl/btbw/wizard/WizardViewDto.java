package pl.btbw.wizard;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@SessionScoped
public class WizardViewDto implements Serializable {

    private int currentStep;
    private int previousStep;

    public void setCurrentStep(int currentStep) {
        if (previousStep != currentStep && this.currentStep != currentStep) {
            previousStep = this.currentStep;
        }
        this.currentStep = currentStep;
    }

    public int getPreviousStep() {
        return previousStep;
    }
}

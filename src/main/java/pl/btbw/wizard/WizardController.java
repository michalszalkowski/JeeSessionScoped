package pl.btbw.wizard;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/wizard")
public class WizardController {

    @Inject
    private WizardViewDto wizardViewDto;

    @GET
    @Path("/1")
    public String doStep1() {
        wizardViewDto.setCurrentStep(1);
        return "Current step: 1 / Previous step: " + wizardViewDto.getPreviousStep();
    }

    @GET
    @Path("/2")
    public String doStep2() {
        wizardViewDto.setCurrentStep(2);
        return "Current step: 2 / Previous step: " + wizardViewDto.getPreviousStep();
    }

    @GET
    @Path("/d/{step}")
    public String doStep(@PathParam("step") int step) {
        wizardViewDto.setCurrentStep(step);
        return "Current step: " + step + " / Previous step: " + wizardViewDto.getPreviousStep();
    }

}

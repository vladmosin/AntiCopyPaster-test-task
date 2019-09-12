import com.intellij.lang.PsiBuilder;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.psi.JavaPsiFacade;
import com.intellij.psi.impl.JavaPsiFacadeImpl;

public class AntiCopyPaster extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent event) {
        Project project = event.getData(PlatformDataKeys.PROJECT);
        var editor = FileEditorManager.getInstance(project).getSelectedEditor();
        var psifile = event.getData(LangDataKeys.PSI_FILE);
        var psiviewer = event.getData()
        final Editor editor1 = event.getRequiredData(CommonDataKeys.EDITOR);
        Messages.showMessageDialog(project, "Копипаста - зло", "Information", Messages.getInformationIcon());
    }
}

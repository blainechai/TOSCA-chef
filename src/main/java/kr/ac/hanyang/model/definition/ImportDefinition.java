package kr.ac.hanyang.model.definition;

/**
 * Created by blainechai on 2016. 9. 21..
 */

import kr.ac.hanyang.model.basemodel.ToscaValidator;
import kr.ac.hanyang.model.DefinitionKeyName;
import kr.ac.hanyang.model.DefinitionKeyNames;

/**
 * 3.5.7 Import definition
 * <p>
 * Keyname
 * Required
 * Type
 * Constraints
 * Description
 * <p>
 * file
 * yes
 * string
 * None
 * The required symbolic name for the imported file.
 * <p>
 * repository
 * no
 * string
 * None
 * The optional symbolic name of the repository definition where the imported file can be found as a string.
 * <p>
 * namespace_uri
 * no
 * string
 * None
 * The optional namespace URI to that will be applied to type definitions found within the imported file as a string.
 * <p>
 * namespace_prefix
 * no
 * string
 * None
 * The optional namespace prefix (alias) that will be used to indicate the namespace_uri when forming a qualified name (i.e., qname) when referencing type definitions from the imported file.
 * <p>
 * <p>
 * Grammar
 * single line
 * <import_name>: <file_URI>
 * <p>
 * multi line
 * <import_name>:
 * file: <file_URI>
 * repository: <repository_name>
 * namespace_uri: <definition_namespace_uri>
 * namespace_prefix: <definition_namespace_prefix>
 * <p>
 * import_name: represents the required symbolic name for the imported file as a string.
 * file_uri: contains the required name (i.e., URI) of the file to be imported as a string.
 * repository_name: represents the optional symbolic name of the repository definition where the
 * imported file can be found as a string.
 * namespace_uri: represents the optional namespace URI to that will be applied to type definitions found
 * within the imported file as a string.
 * namespace_prefix: represents the optional namespace prefix (alias) that will be used to indicate the
 * namespace_uri when forming a qualified name (i.e., qname) when referencing type definitions from the imported file as a string.
 */
public class ImportDefinition implements ToscaValidator {


    private DefinitionKeyNames keyNames;

    public ImportDefinition() {
        super();
        keyNames = new DefinitionKeyNames();
        keyNames.add(new DefinitionKeyName("file", true, "string", "The required artifact type for the artifact definition.", "None"));
        keyNames.add(new DefinitionKeyName("repository", false, "string", "The optional symbolic name of the repository definition where the imported file can be found as a string.", "None"));
        keyNames.add(new DefinitionKeyName("namespace_uri", false, "string", "The optional namespace URI to that will be applied to type definitions found within the imported file as a string.", "None"));
        keyNames.add(new DefinitionKeyName("namespace_prefix", false, "string", "The optional namespace prefix (alias) that will be used to indicate the namespace_uri when forming a qualified name (i.e., qname) when referencing type definitions from the imported file.", "None"));

    }

    public boolean isValid() {
        return false;
    }
}
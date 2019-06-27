/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.model.resource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Generated;

import com.ibm.watsonhealth.fhir.model.annotation.Constraint;
import com.ibm.watsonhealth.fhir.model.type.Annotation;
import com.ibm.watsonhealth.fhir.model.type.BackboneElement;
import com.ibm.watsonhealth.fhir.model.type.Code;
import com.ibm.watsonhealth.fhir.model.type.CodeableConcept;
import com.ibm.watsonhealth.fhir.model.type.ContactDetail;
import com.ibm.watsonhealth.fhir.model.type.Date;
import com.ibm.watsonhealth.fhir.model.type.DateTime;
import com.ibm.watsonhealth.fhir.model.type.Decimal;
import com.ibm.watsonhealth.fhir.model.type.Extension;
import com.ibm.watsonhealth.fhir.model.type.Id;
import com.ibm.watsonhealth.fhir.model.type.Identifier;
import com.ibm.watsonhealth.fhir.model.type.Integer;
import com.ibm.watsonhealth.fhir.model.type.Markdown;
import com.ibm.watsonhealth.fhir.model.type.Meta;
import com.ibm.watsonhealth.fhir.model.type.Narrative;
import com.ibm.watsonhealth.fhir.model.type.Period;
import com.ibm.watsonhealth.fhir.model.type.PublicationStatus;
import com.ibm.watsonhealth.fhir.model.type.Reference;
import com.ibm.watsonhealth.fhir.model.type.RelatedArtifact;
import com.ibm.watsonhealth.fhir.model.type.String;
import com.ibm.watsonhealth.fhir.model.type.Uri;
import com.ibm.watsonhealth.fhir.model.type.UsageContext;
import com.ibm.watsonhealth.fhir.model.util.ValidationSupport;
import com.ibm.watsonhealth.fhir.model.visitor.Visitor;

/**
 * <p>
 * The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where 
 * the risk estimate is derived from a combination of research studies.
 * </p>
 */
@Constraint(
    key = "rvs-0",
    severity = "warning",
    human = "Name should be usable as an identifier for the module by machine processing applications such as code generation",
    expression = "name.matches('[A-Z]([A-Za-z0-9_]){0,254}')"
)
@Generated("com.ibm.watsonhealth.fhir.tools.CodeGenerator")
public class RiskEvidenceSynthesis extends DomainResource {
    private final Uri url;
    private final List<Identifier> identifier;
    private final String version;
    private final String name;
    private final String title;
    private final PublicationStatus status;
    private final DateTime date;
    private final String publisher;
    private final List<ContactDetail> contact;
    private final Markdown description;
    private final List<Annotation> note;
    private final List<UsageContext> useContext;
    private final List<CodeableConcept> jurisdiction;
    private final Markdown copyright;
    private final Date approvalDate;
    private final Date lastReviewDate;
    private final Period effectivePeriod;
    private final List<CodeableConcept> topic;
    private final List<ContactDetail> author;
    private final List<ContactDetail> editor;
    private final List<ContactDetail> reviewer;
    private final List<ContactDetail> endorser;
    private final List<RelatedArtifact> relatedArtifact;
    private final CodeableConcept synthesisType;
    private final CodeableConcept studyType;
    private final Reference population;
    private final Reference exposure;
    private final Reference outcome;
    private final SampleSize sampleSize;
    private final RiskEstimate riskEstimate;
    private final List<Certainty> certainty;

    private RiskEvidenceSynthesis(Builder builder) {
        super(builder);
        this.url = builder.url;
        this.identifier = builder.identifier;
        this.version = builder.version;
        this.name = builder.name;
        this.title = builder.title;
        this.status = ValidationSupport.requireNonNull(builder.status, "status");
        this.date = builder.date;
        this.publisher = builder.publisher;
        this.contact = builder.contact;
        this.description = builder.description;
        this.note = builder.note;
        this.useContext = builder.useContext;
        this.jurisdiction = builder.jurisdiction;
        this.copyright = builder.copyright;
        this.approvalDate = builder.approvalDate;
        this.lastReviewDate = builder.lastReviewDate;
        this.effectivePeriod = builder.effectivePeriod;
        this.topic = builder.topic;
        this.author = builder.author;
        this.editor = builder.editor;
        this.reviewer = builder.reviewer;
        this.endorser = builder.endorser;
        this.relatedArtifact = builder.relatedArtifact;
        this.synthesisType = builder.synthesisType;
        this.studyType = builder.studyType;
        this.population = ValidationSupport.requireNonNull(builder.population, "population");
        this.exposure = builder.exposure;
        this.outcome = ValidationSupport.requireNonNull(builder.outcome, "outcome");
        this.sampleSize = builder.sampleSize;
        this.riskEstimate = builder.riskEstimate;
        this.certainty = builder.certainty;
    }

    /**
     * <p>
     * An absolute URI that is used to identify this risk evidence synthesis when it is referenced in a specification, model, 
     * design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal 
     * address at which at which an authoritative instance of this risk evidence synthesis is (or will be) published. This 
     * URL can be the target of a canonical reference. It SHALL remain the same when the risk evidence synthesis is stored on 
     * different servers.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Uri}.
     */
    public Uri getUrl() {
        return url;
    }

    /**
     * <p>
     * A formal identifier that is used to identify this risk evidence synthesis when it is represented in other formats, or 
     * referenced in a specification, model, design or an instance.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Identifier}.
     */
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * <p>
     * The identifier that is used to identify this version of the risk evidence synthesis when it is referenced in a 
     * specification, model, design or instance. This is an arbitrary value managed by the risk evidence synthesis author and 
     * is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is 
     * not available. There is also no expectation that versions can be placed in a lexicographical sequence.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link String}.
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * A natural language name identifying the risk evidence synthesis. This name should be usable as an identifier for the 
     * module by machine processing applications such as code generation.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link String}.
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A short, descriptive, user-friendly title for the risk evidence synthesis.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link String}.
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * The status of this risk evidence synthesis. Enables tracking the life-cycle of the content.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link PublicationStatus}.
     */
    public PublicationStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The date (and optionally time) when the risk evidence synthesis was published. The date must change when the business 
     * version changes and it must change if the status code changes. In addition, it should change when the substantive 
     * content of the risk evidence synthesis changes.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link DateTime}.
     */
    public DateTime getDate() {
        return date;
    }

    /**
     * <p>
     * The name of the organization or individual that published the risk evidence synthesis.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link String}.
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * <p>
     * Contact details to assist a user in finding and communicating with the publisher.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link ContactDetail}.
     */
    public List<ContactDetail> getContact() {
        return contact;
    }

    /**
     * <p>
     * A free text natural language description of the risk evidence synthesis from a consumer's perspective.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Markdown}.
     */
    public Markdown getDescription() {
        return description;
    }

    /**
     * <p>
     * A human-readable string to clarify or explain concepts about the resource.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Annotation}.
     */
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * <p>
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be 
     * general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and 
     * may be used to assist with indexing and searching for appropriate risk evidence synthesis instances.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link UsageContext}.
     */
    public List<UsageContext> getUseContext() {
        return useContext;
    }

    /**
     * <p>
     * A legal or geographic region in which the risk evidence synthesis is intended to be used.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link CodeableConcept}.
     */
    public List<CodeableConcept> getJurisdiction() {
        return jurisdiction;
    }

    /**
     * <p>
     * A copyright statement relating to the risk evidence synthesis and/or its contents. Copyright statements are generally 
     * legal restrictions on the use and publishing of the risk evidence synthesis.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Markdown}.
     */
    public Markdown getCopyright() {
        return copyright;
    }

    /**
     * <p>
     * The date on which the resource content was approved by the publisher. Approval happens once when the content is 
     * officially approved for usage.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Date}.
     */
    public Date getApprovalDate() {
        return approvalDate;
    }

    /**
     * <p>
     * The date on which the resource content was last reviewed. Review happens periodically after approval but does not 
     * change the original approval date.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Date}.
     */
    public Date getLastReviewDate() {
        return lastReviewDate;
    }

    /**
     * <p>
     * The period during which the risk evidence synthesis content was or is planned to be in active use.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Period}.
     */
    public Period getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * <p>
     * Descriptive topics related to the content of the RiskEvidenceSynthesis. Topics provide a high-level categorization 
     * grouping types of EffectEvidenceSynthesiss that can be useful for filtering and searching.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link CodeableConcept}.
     */
    public List<CodeableConcept> getTopic() {
        return topic;
    }

    /**
     * <p>
     * An individiual or organization primarily involved in the creation and maintenance of the content.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link ContactDetail}.
     */
    public List<ContactDetail> getAuthor() {
        return author;
    }

    /**
     * <p>
     * An individual or organization primarily responsible for internal coherence of the content.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link ContactDetail}.
     */
    public List<ContactDetail> getEditor() {
        return editor;
    }

    /**
     * <p>
     * An individual or organization primarily responsible for review of some aspect of the content.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link ContactDetail}.
     */
    public List<ContactDetail> getReviewer() {
        return reviewer;
    }

    /**
     * <p>
     * An individual or organization responsible for officially endorsing the content for use in some setting.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link ContactDetail}.
     */
    public List<ContactDetail> getEndorser() {
        return endorser;
    }

    /**
     * <p>
     * Related artifacts such as additional documentation, justification, or bibliographic references.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link RelatedArtifact}.
     */
    public List<RelatedArtifact> getRelatedArtifact() {
        return relatedArtifact;
    }

    /**
     * <p>
     * Type of synthesis eg meta-analysis.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link CodeableConcept}.
     */
    public CodeableConcept getSynthesisType() {
        return synthesisType;
    }

    /**
     * <p>
     * Type of study eg randomized trial.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link CodeableConcept}.
     */
    public CodeableConcept getStudyType() {
        return studyType;
    }

    /**
     * <p>
     * A reference to a EvidenceVariable resource that defines the population for the research.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getPopulation() {
        return population;
    }

    /**
     * <p>
     * A reference to a EvidenceVariable resource that defines the exposure for the research.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getExposure() {
        return exposure;
    }

    /**
     * <p>
     * A reference to a EvidenceVariable resomece that defines the outcome for the research.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getOutcome() {
        return outcome;
    }

    /**
     * <p>
     * A description of the size of the sample involved in the synthesis.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link SampleSize}.
     */
    public SampleSize getSampleSize() {
        return sampleSize;
    }

    /**
     * <p>
     * The estimated risk of the outcome.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link RiskEstimate}.
     */
    public RiskEstimate getRiskEstimate() {
        return riskEstimate;
    }

    /**
     * <p>
     * A description of the certainty of the risk estimate.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Certainty}.
     */
    public List<Certainty> getCertainty() {
        return certainty;
    }

    @Override
    public void accept(java.lang.String elementName, Visitor visitor) {
        if (visitor.preVisit(this)) {
            visitor.visitStart(elementName, this);
            if (visitor.visit(elementName, this)) {
                // visit children
                accept(id, "id", visitor);
                accept(meta, "meta", visitor);
                accept(implicitRules, "implicitRules", visitor);
                accept(language, "language", visitor);
                accept(text, "text", visitor);
                accept(contained, "contained", visitor, Resource.class);
                accept(extension, "extension", visitor, Extension.class);
                accept(modifierExtension, "modifierExtension", visitor, Extension.class);
                accept(url, "url", visitor);
                accept(identifier, "identifier", visitor, Identifier.class);
                accept(version, "version", visitor);
                accept(name, "name", visitor);
                accept(title, "title", visitor);
                accept(status, "status", visitor);
                accept(date, "date", visitor);
                accept(publisher, "publisher", visitor);
                accept(contact, "contact", visitor, ContactDetail.class);
                accept(description, "description", visitor);
                accept(note, "note", visitor, Annotation.class);
                accept(useContext, "useContext", visitor, UsageContext.class);
                accept(jurisdiction, "jurisdiction", visitor, CodeableConcept.class);
                accept(copyright, "copyright", visitor);
                accept(approvalDate, "approvalDate", visitor);
                accept(lastReviewDate, "lastReviewDate", visitor);
                accept(effectivePeriod, "effectivePeriod", visitor);
                accept(topic, "topic", visitor, CodeableConcept.class);
                accept(author, "author", visitor, ContactDetail.class);
                accept(editor, "editor", visitor, ContactDetail.class);
                accept(reviewer, "reviewer", visitor, ContactDetail.class);
                accept(endorser, "endorser", visitor, ContactDetail.class);
                accept(relatedArtifact, "relatedArtifact", visitor, RelatedArtifact.class);
                accept(synthesisType, "synthesisType", visitor);
                accept(studyType, "studyType", visitor);
                accept(population, "population", visitor);
                accept(exposure, "exposure", visitor);
                accept(outcome, "outcome", visitor);
                accept(sampleSize, "sampleSize", visitor);
                accept(riskEstimate, "riskEstimate", visitor);
                accept(certainty, "certainty", visitor, Certainty.class);
            }
            visitor.visitEnd(elementName, this);
            visitor.postVisit(this);
        }
    }

    @Override
    public Builder toBuilder() {
        Builder builder = new Builder(status, population, outcome);
        builder.id = id;
        builder.meta = meta;
        builder.implicitRules = implicitRules;
        builder.language = language;
        builder.text = text;
        builder.contained.addAll(contained);
        builder.extension.addAll(extension);
        builder.modifierExtension.addAll(modifierExtension);
        builder.url = url;
        builder.identifier.addAll(identifier);
        builder.version = version;
        builder.name = name;
        builder.title = title;
        builder.date = date;
        builder.publisher = publisher;
        builder.contact.addAll(contact);
        builder.description = description;
        builder.note.addAll(note);
        builder.useContext.addAll(useContext);
        builder.jurisdiction.addAll(jurisdiction);
        builder.copyright = copyright;
        builder.approvalDate = approvalDate;
        builder.lastReviewDate = lastReviewDate;
        builder.effectivePeriod = effectivePeriod;
        builder.topic.addAll(topic);
        builder.author.addAll(author);
        builder.editor.addAll(editor);
        builder.reviewer.addAll(reviewer);
        builder.endorser.addAll(endorser);
        builder.relatedArtifact.addAll(relatedArtifact);
        builder.synthesisType = synthesisType;
        builder.studyType = studyType;
        builder.exposure = exposure;
        builder.sampleSize = sampleSize;
        builder.riskEstimate = riskEstimate;
        builder.certainty.addAll(certainty);
        return builder;
    }

    public static Builder builder(PublicationStatus status, Reference population, Reference outcome) {
        return new Builder(status, population, outcome);
    }

    public static class Builder extends DomainResource.Builder {
        // required
        private final PublicationStatus status;
        private final Reference population;
        private final Reference outcome;

        // optional
        private Uri url;
        private List<Identifier> identifier = new ArrayList<>();
        private String version;
        private String name;
        private String title;
        private DateTime date;
        private String publisher;
        private List<ContactDetail> contact = new ArrayList<>();
        private Markdown description;
        private List<Annotation> note = new ArrayList<>();
        private List<UsageContext> useContext = new ArrayList<>();
        private List<CodeableConcept> jurisdiction = new ArrayList<>();
        private Markdown copyright;
        private Date approvalDate;
        private Date lastReviewDate;
        private Period effectivePeriod;
        private List<CodeableConcept> topic = new ArrayList<>();
        private List<ContactDetail> author = new ArrayList<>();
        private List<ContactDetail> editor = new ArrayList<>();
        private List<ContactDetail> reviewer = new ArrayList<>();
        private List<ContactDetail> endorser = new ArrayList<>();
        private List<RelatedArtifact> relatedArtifact = new ArrayList<>();
        private CodeableConcept synthesisType;
        private CodeableConcept studyType;
        private Reference exposure;
        private SampleSize sampleSize;
        private RiskEstimate riskEstimate;
        private List<Certainty> certainty = new ArrayList<>();

        private Builder(PublicationStatus status, Reference population, Reference outcome) {
            super();
            this.status = status;
            this.population = population;
            this.outcome = outcome;
        }

        /**
         * <p>
         * The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
         * </p>
         * 
         * @param id
         *     Logical id of this artifact
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder id(Id id) {
            return (Builder) super.id(id);
        }

        /**
         * <p>
         * The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content 
         * might not always be associated with version changes to the resource.
         * </p>
         * 
         * @param meta
         *     Metadata about the resource
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder meta(Meta meta) {
            return (Builder) super.meta(meta);
        }

        /**
         * <p>
         * A reference to a set of rules that were followed when the resource was constructed, and which must be understood when 
         * processing the content. Often, this is a reference to an implementation guide that defines the special rules along 
         * with other profiles etc.
         * </p>
         * 
         * @param implicitRules
         *     A set of rules under which this content was created
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder implicitRules(Uri implicitRules) {
            return (Builder) super.implicitRules(implicitRules);
        }

        /**
         * <p>
         * The base language in which the resource is written.
         * </p>
         * 
         * @param language
         *     Language of the resource content
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder language(Code language) {
            return (Builder) super.language(language);
        }

        /**
         * <p>
         * A human-readable narrative that contains a summary of the resource and can be used to represent the content of the 
         * resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient 
         * detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what 
         * content should be represented in the narrative to ensure clinical safety.
         * </p>
         * 
         * @param text
         *     Text summary of the resource, for human interpretation
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder text(Narrative text) {
            return (Builder) super.text(text);
        }

        /**
         * <p>
         * These resources do not have an independent existence apart from the resource that contains them - they cannot be 
         * identified independently, and nor can they have their own independent transaction scope.
         * </p>
         * 
         * @param contained
         *     Contained, inline Resources
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder contained(Resource... contained) {
            return (Builder) super.contained(contained);
        }

        /**
         * <p>
         * These resources do not have an independent existence apart from the resource that contains them - they cannot be 
         * identified independently, and nor can they have their own independent transaction scope.
         * </p>
         * 
         * @param contained
         *     Contained, inline Resources
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder contained(Collection<Resource> contained) {
            return (Builder) super.contained(contained);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the resource. To make the 
         * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
         * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
         * of the definition of the extension.
         * </p>
         * 
         * @param extension
         *     Additional content defined by implementations
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder extension(Extension... extension) {
            return (Builder) super.extension(extension);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the resource. To make the 
         * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
         * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
         * of the definition of the extension.
         * </p>
         * 
         * @param extension
         *     Additional content defined by implementations
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder extension(Collection<Extension> extension) {
            return (Builder) super.extension(extension);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the resource and that 
         * modifies the understanding of the element that contains it and/or the understanding of the containing element's 
         * descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and 
         * manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
         * implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the 
         * definition of the extension. Applications processing a resource are required to check for modifier extensions.
         * </p>
         * <p>
         * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
         * change the meaning of modifierExtension itself).
         * </p>
         * 
         * @param modifierExtension
         *     Extensions that cannot be ignored
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder modifierExtension(Extension... modifierExtension) {
            return (Builder) super.modifierExtension(modifierExtension);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the resource and that 
         * modifies the understanding of the element that contains it and/or the understanding of the containing element's 
         * descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and 
         * manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
         * implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the 
         * definition of the extension. Applications processing a resource are required to check for modifier extensions.
         * </p>
         * <p>
         * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
         * change the meaning of modifierExtension itself).
         * </p>
         * 
         * @param modifierExtension
         *     Extensions that cannot be ignored
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder modifierExtension(Collection<Extension> modifierExtension) {
            return (Builder) super.modifierExtension(modifierExtension);
        }

        /**
         * <p>
         * An absolute URI that is used to identify this risk evidence synthesis when it is referenced in a specification, model, 
         * design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal 
         * address at which at which an authoritative instance of this risk evidence synthesis is (or will be) published. This 
         * URL can be the target of a canonical reference. It SHALL remain the same when the risk evidence synthesis is stored on 
         * different servers.
         * </p>
         * 
         * @param url
         *     Canonical identifier for this risk evidence synthesis, represented as a URI (globally unique)
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder url(Uri url) {
            this.url = url;
            return this;
        }

        /**
         * <p>
         * A formal identifier that is used to identify this risk evidence synthesis when it is represented in other formats, or 
         * referenced in a specification, model, design or an instance.
         * </p>
         * 
         * @param identifier
         *     Additional identifier for the risk evidence synthesis
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder identifier(Identifier... identifier) {
            for (Identifier value : identifier) {
                this.identifier.add(value);
            }
            return this;
        }

        /**
         * <p>
         * A formal identifier that is used to identify this risk evidence synthesis when it is represented in other formats, or 
         * referenced in a specification, model, design or an instance.
         * </p>
         * 
         * @param identifier
         *     Additional identifier for the risk evidence synthesis
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder identifier(Collection<Identifier> identifier) {
            this.identifier.addAll(identifier);
            return this;
        }

        /**
         * <p>
         * The identifier that is used to identify this version of the risk evidence synthesis when it is referenced in a 
         * specification, model, design or instance. This is an arbitrary value managed by the risk evidence synthesis author and 
         * is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is 
         * not available. There is also no expectation that versions can be placed in a lexicographical sequence.
         * </p>
         * 
         * @param version
         *     Business version of the risk evidence synthesis
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * <p>
         * A natural language name identifying the risk evidence synthesis. This name should be usable as an identifier for the 
         * module by machine processing applications such as code generation.
         * </p>
         * 
         * @param name
         *     Name for this risk evidence synthesis (computer friendly)
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>
         * A short, descriptive, user-friendly title for the risk evidence synthesis.
         * </p>
         * 
         * @param title
         *     Name for this risk evidence synthesis (human friendly)
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>
         * The date (and optionally time) when the risk evidence synthesis was published. The date must change when the business 
         * version changes and it must change if the status code changes. In addition, it should change when the substantive 
         * content of the risk evidence synthesis changes.
         * </p>
         * 
         * @param date
         *     Date last changed
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder date(DateTime date) {
            this.date = date;
            return this;
        }

        /**
         * <p>
         * The name of the organization or individual that published the risk evidence synthesis.
         * </p>
         * 
         * @param publisher
         *     Name of the publisher (organization or individual)
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        /**
         * <p>
         * Contact details to assist a user in finding and communicating with the publisher.
         * </p>
         * 
         * @param contact
         *     Contact details for the publisher
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder contact(ContactDetail... contact) {
            for (ContactDetail value : contact) {
                this.contact.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Contact details to assist a user in finding and communicating with the publisher.
         * </p>
         * 
         * @param contact
         *     Contact details for the publisher
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder contact(Collection<ContactDetail> contact) {
            this.contact.addAll(contact);
            return this;
        }

        /**
         * <p>
         * A free text natural language description of the risk evidence synthesis from a consumer's perspective.
         * </p>
         * 
         * @param description
         *     Natural language description of the risk evidence synthesis
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder description(Markdown description) {
            this.description = description;
            return this;
        }

        /**
         * <p>
         * A human-readable string to clarify or explain concepts about the resource.
         * </p>
         * 
         * @param note
         *     Used for footnotes or explanatory notes
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder note(Annotation... note) {
            for (Annotation value : note) {
                this.note.add(value);
            }
            return this;
        }

        /**
         * <p>
         * A human-readable string to clarify or explain concepts about the resource.
         * </p>
         * 
         * @param note
         *     Used for footnotes or explanatory notes
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder note(Collection<Annotation> note) {
            this.note.addAll(note);
            return this;
        }

        /**
         * <p>
         * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be 
         * general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and 
         * may be used to assist with indexing and searching for appropriate risk evidence synthesis instances.
         * </p>
         * 
         * @param useContext
         *     The context that the content is intended to support
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder useContext(UsageContext... useContext) {
            for (UsageContext value : useContext) {
                this.useContext.add(value);
            }
            return this;
        }

        /**
         * <p>
         * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be 
         * general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and 
         * may be used to assist with indexing and searching for appropriate risk evidence synthesis instances.
         * </p>
         * 
         * @param useContext
         *     The context that the content is intended to support
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder useContext(Collection<UsageContext> useContext) {
            this.useContext.addAll(useContext);
            return this;
        }

        /**
         * <p>
         * A legal or geographic region in which the risk evidence synthesis is intended to be used.
         * </p>
         * 
         * @param jurisdiction
         *     Intended jurisdiction for risk evidence synthesis (if applicable)
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder jurisdiction(CodeableConcept... jurisdiction) {
            for (CodeableConcept value : jurisdiction) {
                this.jurisdiction.add(value);
            }
            return this;
        }

        /**
         * <p>
         * A legal or geographic region in which the risk evidence synthesis is intended to be used.
         * </p>
         * 
         * @param jurisdiction
         *     Intended jurisdiction for risk evidence synthesis (if applicable)
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder jurisdiction(Collection<CodeableConcept> jurisdiction) {
            this.jurisdiction.addAll(jurisdiction);
            return this;
        }

        /**
         * <p>
         * A copyright statement relating to the risk evidence synthesis and/or its contents. Copyright statements are generally 
         * legal restrictions on the use and publishing of the risk evidence synthesis.
         * </p>
         * 
         * @param copyright
         *     Use and/or publishing restrictions
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder copyright(Markdown copyright) {
            this.copyright = copyright;
            return this;
        }

        /**
         * <p>
         * The date on which the resource content was approved by the publisher. Approval happens once when the content is 
         * officially approved for usage.
         * </p>
         * 
         * @param approvalDate
         *     When the risk evidence synthesis was approved by publisher
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder approvalDate(Date approvalDate) {
            this.approvalDate = approvalDate;
            return this;
        }

        /**
         * <p>
         * The date on which the resource content was last reviewed. Review happens periodically after approval but does not 
         * change the original approval date.
         * </p>
         * 
         * @param lastReviewDate
         *     When the risk evidence synthesis was last reviewed
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder lastReviewDate(Date lastReviewDate) {
            this.lastReviewDate = lastReviewDate;
            return this;
        }

        /**
         * <p>
         * The period during which the risk evidence synthesis content was or is planned to be in active use.
         * </p>
         * 
         * @param effectivePeriod
         *     When the risk evidence synthesis is expected to be used
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder effectivePeriod(Period effectivePeriod) {
            this.effectivePeriod = effectivePeriod;
            return this;
        }

        /**
         * <p>
         * Descriptive topics related to the content of the RiskEvidenceSynthesis. Topics provide a high-level categorization 
         * grouping types of EffectEvidenceSynthesiss that can be useful for filtering and searching.
         * </p>
         * 
         * @param topic
         *     The category of the EffectEvidenceSynthesis, such as Education, Treatment, Assessment, etc.
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder topic(CodeableConcept... topic) {
            for (CodeableConcept value : topic) {
                this.topic.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Descriptive topics related to the content of the RiskEvidenceSynthesis. Topics provide a high-level categorization 
         * grouping types of EffectEvidenceSynthesiss that can be useful for filtering and searching.
         * </p>
         * 
         * @param topic
         *     The category of the EffectEvidenceSynthesis, such as Education, Treatment, Assessment, etc.
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder topic(Collection<CodeableConcept> topic) {
            this.topic.addAll(topic);
            return this;
        }

        /**
         * <p>
         * An individiual or organization primarily involved in the creation and maintenance of the content.
         * </p>
         * 
         * @param author
         *     Who authored the content
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder author(ContactDetail... author) {
            for (ContactDetail value : author) {
                this.author.add(value);
            }
            return this;
        }

        /**
         * <p>
         * An individiual or organization primarily involved in the creation and maintenance of the content.
         * </p>
         * 
         * @param author
         *     Who authored the content
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder author(Collection<ContactDetail> author) {
            this.author.addAll(author);
            return this;
        }

        /**
         * <p>
         * An individual or organization primarily responsible for internal coherence of the content.
         * </p>
         * 
         * @param editor
         *     Who edited the content
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder editor(ContactDetail... editor) {
            for (ContactDetail value : editor) {
                this.editor.add(value);
            }
            return this;
        }

        /**
         * <p>
         * An individual or organization primarily responsible for internal coherence of the content.
         * </p>
         * 
         * @param editor
         *     Who edited the content
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder editor(Collection<ContactDetail> editor) {
            this.editor.addAll(editor);
            return this;
        }

        /**
         * <p>
         * An individual or organization primarily responsible for review of some aspect of the content.
         * </p>
         * 
         * @param reviewer
         *     Who reviewed the content
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder reviewer(ContactDetail... reviewer) {
            for (ContactDetail value : reviewer) {
                this.reviewer.add(value);
            }
            return this;
        }

        /**
         * <p>
         * An individual or organization primarily responsible for review of some aspect of the content.
         * </p>
         * 
         * @param reviewer
         *     Who reviewed the content
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder reviewer(Collection<ContactDetail> reviewer) {
            this.reviewer.addAll(reviewer);
            return this;
        }

        /**
         * <p>
         * An individual or organization responsible for officially endorsing the content for use in some setting.
         * </p>
         * 
         * @param endorser
         *     Who endorsed the content
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder endorser(ContactDetail... endorser) {
            for (ContactDetail value : endorser) {
                this.endorser.add(value);
            }
            return this;
        }

        /**
         * <p>
         * An individual or organization responsible for officially endorsing the content for use in some setting.
         * </p>
         * 
         * @param endorser
         *     Who endorsed the content
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder endorser(Collection<ContactDetail> endorser) {
            this.endorser.addAll(endorser);
            return this;
        }

        /**
         * <p>
         * Related artifacts such as additional documentation, justification, or bibliographic references.
         * </p>
         * 
         * @param relatedArtifact
         *     Additional documentation, citations, etc.
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder relatedArtifact(RelatedArtifact... relatedArtifact) {
            for (RelatedArtifact value : relatedArtifact) {
                this.relatedArtifact.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Related artifacts such as additional documentation, justification, or bibliographic references.
         * </p>
         * 
         * @param relatedArtifact
         *     Additional documentation, citations, etc.
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder relatedArtifact(Collection<RelatedArtifact> relatedArtifact) {
            this.relatedArtifact.addAll(relatedArtifact);
            return this;
        }

        /**
         * <p>
         * Type of synthesis eg meta-analysis.
         * </p>
         * 
         * @param synthesisType
         *     Type of synthesis
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder synthesisType(CodeableConcept synthesisType) {
            this.synthesisType = synthesisType;
            return this;
        }

        /**
         * <p>
         * Type of study eg randomized trial.
         * </p>
         * 
         * @param studyType
         *     Type of study
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder studyType(CodeableConcept studyType) {
            this.studyType = studyType;
            return this;
        }

        /**
         * <p>
         * A reference to a EvidenceVariable resource that defines the exposure for the research.
         * </p>
         * 
         * @param exposure
         *     What exposure?
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder exposure(Reference exposure) {
            this.exposure = exposure;
            return this;
        }

        /**
         * <p>
         * A description of the size of the sample involved in the synthesis.
         * </p>
         * 
         * @param sampleSize
         *     What sample size was involved?
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder sampleSize(SampleSize sampleSize) {
            this.sampleSize = sampleSize;
            return this;
        }

        /**
         * <p>
         * The estimated risk of the outcome.
         * </p>
         * 
         * @param riskEstimate
         *     What was the estimated risk
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder riskEstimate(RiskEstimate riskEstimate) {
            this.riskEstimate = riskEstimate;
            return this;
        }

        /**
         * <p>
         * A description of the certainty of the risk estimate.
         * </p>
         * 
         * @param certainty
         *     How certain is the risk
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder certainty(Certainty... certainty) {
            for (Certainty value : certainty) {
                this.certainty.add(value);
            }
            return this;
        }

        /**
         * <p>
         * A description of the certainty of the risk estimate.
         * </p>
         * 
         * @param certainty
         *     How certain is the risk
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder certainty(Collection<Certainty> certainty) {
            this.certainty.addAll(certainty);
            return this;
        }

        @Override
        public RiskEvidenceSynthesis build() {
            return new RiskEvidenceSynthesis(this);
        }
    }

    /**
     * <p>
     * A description of the size of the sample involved in the synthesis.
     * </p>
     */
    public static class SampleSize extends BackboneElement {
        private final String description;
        private final Integer numberOfStudies;
        private final Integer numberOfParticipants;

        private SampleSize(Builder builder) {
            super(builder);
            this.description = builder.description;
            this.numberOfStudies = builder.numberOfStudies;
            this.numberOfParticipants = builder.numberOfParticipants;
        }

        /**
         * <p>
         * Human-readable summary of sample size.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link String}.
         */
        public String getDescription() {
            return description;
        }

        /**
         * <p>
         * Number of studies included in this evidence synthesis.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Integer}.
         */
        public Integer getNumberOfStudies() {
            return numberOfStudies;
        }

        /**
         * <p>
         * Number of participants included in this evidence synthesis.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Integer}.
         */
        public Integer getNumberOfParticipants() {
            return numberOfParticipants;
        }

        @Override
        public void accept(java.lang.String elementName, Visitor visitor) {
            if (visitor.preVisit(this)) {
                visitor.visitStart(elementName, this);
                if (visitor.visit(elementName, this)) {
                    // visit children
                    accept(id, "id", visitor);
                    accept(extension, "extension", visitor, Extension.class);
                    accept(modifierExtension, "modifierExtension", visitor, Extension.class);
                    accept(description, "description", visitor);
                    accept(numberOfStudies, "numberOfStudies", visitor);
                    accept(numberOfParticipants, "numberOfParticipants", visitor);
                }
                visitor.visitEnd(elementName, this);
                visitor.postVisit(this);
            }
        }

        @Override
        public Builder toBuilder() {
            return Builder.from(this);
        }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder extends BackboneElement.Builder {
            // optional
            private String description;
            private Integer numberOfStudies;
            private Integer numberOfParticipants;

            private Builder() {
                super();
            }

            /**
             * <p>
             * Unique id for the element within a resource (for internal references). This may be any string value that does not 
             * contain spaces.
             * </p>
             * 
             * @param id
             *     Unique id for inter-element referencing
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder id(java.lang.String id) {
                return (Builder) super.id(id);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element. To make the 
             * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
             * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
             * of the definition of the extension.
             * </p>
             * 
             * @param extension
             *     Additional content defined by implementations
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder extension(Extension... extension) {
                return (Builder) super.extension(extension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element. To make the 
             * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
             * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
             * of the definition of the extension.
             * </p>
             * 
             * @param extension
             *     Additional content defined by implementations
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder extension(Collection<Extension> extension) {
                return (Builder) super.extension(extension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element and that 
             * modifies the understanding of the element in which it is contained and/or the understanding of the containing 
             * element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe 
             * and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
             * implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the 
             * extension. Applications processing a resource are required to check for modifier extensions.
             * </p>
             * <p>
             * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
             * change the meaning of modifierExtension itself).
             * </p>
             * 
             * @param modifierExtension
             *     Extensions that cannot be ignored even if unrecognized
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder modifierExtension(Extension... modifierExtension) {
                return (Builder) super.modifierExtension(modifierExtension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element and that 
             * modifies the understanding of the element in which it is contained and/or the understanding of the containing 
             * element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe 
             * and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
             * implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the 
             * extension. Applications processing a resource are required to check for modifier extensions.
             * </p>
             * <p>
             * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
             * change the meaning of modifierExtension itself).
             * </p>
             * 
             * @param modifierExtension
             *     Extensions that cannot be ignored even if unrecognized
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder modifierExtension(Collection<Extension> modifierExtension) {
                return (Builder) super.modifierExtension(modifierExtension);
            }

            /**
             * <p>
             * Human-readable summary of sample size.
             * </p>
             * 
             * @param description
             *     Description of sample size
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>
             * Number of studies included in this evidence synthesis.
             * </p>
             * 
             * @param numberOfStudies
             *     How many studies?
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder numberOfStudies(Integer numberOfStudies) {
                this.numberOfStudies = numberOfStudies;
                return this;
            }

            /**
             * <p>
             * Number of participants included in this evidence synthesis.
             * </p>
             * 
             * @param numberOfParticipants
             *     How many participants?
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder numberOfParticipants(Integer numberOfParticipants) {
                this.numberOfParticipants = numberOfParticipants;
                return this;
            }

            @Override
            public SampleSize build() {
                return new SampleSize(this);
            }

            private static Builder from(SampleSize sampleSize) {
                Builder builder = new Builder();
                builder.id = sampleSize.id;
                builder.extension.addAll(sampleSize.extension);
                builder.modifierExtension.addAll(sampleSize.modifierExtension);
                builder.description = sampleSize.description;
                builder.numberOfStudies = sampleSize.numberOfStudies;
                builder.numberOfParticipants = sampleSize.numberOfParticipants;
                return builder;
            }
        }
    }

    /**
     * <p>
     * The estimated risk of the outcome.
     * </p>
     */
    public static class RiskEstimate extends BackboneElement {
        private final String description;
        private final CodeableConcept type;
        private final Decimal value;
        private final CodeableConcept unitOfMeasure;
        private final Integer denominatorCount;
        private final Integer numeratorCount;
        private final List<PrecisionEstimate> precisionEstimate;

        private RiskEstimate(Builder builder) {
            super(builder);
            this.description = builder.description;
            this.type = builder.type;
            this.value = builder.value;
            this.unitOfMeasure = builder.unitOfMeasure;
            this.denominatorCount = builder.denominatorCount;
            this.numeratorCount = builder.numeratorCount;
            this.precisionEstimate = builder.precisionEstimate;
        }

        /**
         * <p>
         * Human-readable summary of risk estimate.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link String}.
         */
        public String getDescription() {
            return description;
        }

        /**
         * <p>
         * Examples include proportion and mean.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getType() {
            return type;
        }

        /**
         * <p>
         * The point estimate of the risk estimate.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Decimal}.
         */
        public Decimal getValue() {
            return value;
        }

        /**
         * <p>
         * Specifies the UCUM unit for the outcome.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getUnitOfMeasure() {
            return unitOfMeasure;
        }

        /**
         * <p>
         * The sample size for the group that was measured for this risk estimate.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Integer}.
         */
        public Integer getDenominatorCount() {
            return denominatorCount;
        }

        /**
         * <p>
         * The number of group members with the outcome of interest.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Integer}.
         */
        public Integer getNumeratorCount() {
            return numeratorCount;
        }

        /**
         * <p>
         * A description of the precision of the estimate for the effect.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link PrecisionEstimate}.
         */
        public List<PrecisionEstimate> getPrecisionEstimate() {
            return precisionEstimate;
        }

        @Override
        public void accept(java.lang.String elementName, Visitor visitor) {
            if (visitor.preVisit(this)) {
                visitor.visitStart(elementName, this);
                if (visitor.visit(elementName, this)) {
                    // visit children
                    accept(id, "id", visitor);
                    accept(extension, "extension", visitor, Extension.class);
                    accept(modifierExtension, "modifierExtension", visitor, Extension.class);
                    accept(description, "description", visitor);
                    accept(type, "type", visitor);
                    accept(value, "value", visitor);
                    accept(unitOfMeasure, "unitOfMeasure", visitor);
                    accept(denominatorCount, "denominatorCount", visitor);
                    accept(numeratorCount, "numeratorCount", visitor);
                    accept(precisionEstimate, "precisionEstimate", visitor, PrecisionEstimate.class);
                }
                visitor.visitEnd(elementName, this);
                visitor.postVisit(this);
            }
        }

        @Override
        public Builder toBuilder() {
            return Builder.from(this);
        }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder extends BackboneElement.Builder {
            // optional
            private String description;
            private CodeableConcept type;
            private Decimal value;
            private CodeableConcept unitOfMeasure;
            private Integer denominatorCount;
            private Integer numeratorCount;
            private List<PrecisionEstimate> precisionEstimate = new ArrayList<>();

            private Builder() {
                super();
            }

            /**
             * <p>
             * Unique id for the element within a resource (for internal references). This may be any string value that does not 
             * contain spaces.
             * </p>
             * 
             * @param id
             *     Unique id for inter-element referencing
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder id(java.lang.String id) {
                return (Builder) super.id(id);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element. To make the 
             * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
             * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
             * of the definition of the extension.
             * </p>
             * 
             * @param extension
             *     Additional content defined by implementations
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder extension(Extension... extension) {
                return (Builder) super.extension(extension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element. To make the 
             * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
             * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
             * of the definition of the extension.
             * </p>
             * 
             * @param extension
             *     Additional content defined by implementations
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder extension(Collection<Extension> extension) {
                return (Builder) super.extension(extension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element and that 
             * modifies the understanding of the element in which it is contained and/or the understanding of the containing 
             * element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe 
             * and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
             * implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the 
             * extension. Applications processing a resource are required to check for modifier extensions.
             * </p>
             * <p>
             * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
             * change the meaning of modifierExtension itself).
             * </p>
             * 
             * @param modifierExtension
             *     Extensions that cannot be ignored even if unrecognized
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder modifierExtension(Extension... modifierExtension) {
                return (Builder) super.modifierExtension(modifierExtension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element and that 
             * modifies the understanding of the element in which it is contained and/or the understanding of the containing 
             * element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe 
             * and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
             * implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the 
             * extension. Applications processing a resource are required to check for modifier extensions.
             * </p>
             * <p>
             * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
             * change the meaning of modifierExtension itself).
             * </p>
             * 
             * @param modifierExtension
             *     Extensions that cannot be ignored even if unrecognized
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder modifierExtension(Collection<Extension> modifierExtension) {
                return (Builder) super.modifierExtension(modifierExtension);
            }

            /**
             * <p>
             * Human-readable summary of risk estimate.
             * </p>
             * 
             * @param description
             *     Description of risk estimate
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>
             * Examples include proportion and mean.
             * </p>
             * 
             * @param type
             *     Type of risk estimate
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder type(CodeableConcept type) {
                this.type = type;
                return this;
            }

            /**
             * <p>
             * The point estimate of the risk estimate.
             * </p>
             * 
             * @param value
             *     Point estimate
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder value(Decimal value) {
                this.value = value;
                return this;
            }

            /**
             * <p>
             * Specifies the UCUM unit for the outcome.
             * </p>
             * 
             * @param unitOfMeasure
             *     What unit is the outcome described in?
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder unitOfMeasure(CodeableConcept unitOfMeasure) {
                this.unitOfMeasure = unitOfMeasure;
                return this;
            }

            /**
             * <p>
             * The sample size for the group that was measured for this risk estimate.
             * </p>
             * 
             * @param denominatorCount
             *     Sample size for group measured
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder denominatorCount(Integer denominatorCount) {
                this.denominatorCount = denominatorCount;
                return this;
            }

            /**
             * <p>
             * The number of group members with the outcome of interest.
             * </p>
             * 
             * @param numeratorCount
             *     Number with the outcome
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder numeratorCount(Integer numeratorCount) {
                this.numeratorCount = numeratorCount;
                return this;
            }

            /**
             * <p>
             * A description of the precision of the estimate for the effect.
             * </p>
             * 
             * @param precisionEstimate
             *     How precise the estimate is
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder precisionEstimate(PrecisionEstimate... precisionEstimate) {
                for (PrecisionEstimate value : precisionEstimate) {
                    this.precisionEstimate.add(value);
                }
                return this;
            }

            /**
             * <p>
             * A description of the precision of the estimate for the effect.
             * </p>
             * 
             * @param precisionEstimate
             *     How precise the estimate is
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder precisionEstimate(Collection<PrecisionEstimate> precisionEstimate) {
                this.precisionEstimate.addAll(precisionEstimate);
                return this;
            }

            @Override
            public RiskEstimate build() {
                return new RiskEstimate(this);
            }

            private static Builder from(RiskEstimate riskEstimate) {
                Builder builder = new Builder();
                builder.id = riskEstimate.id;
                builder.extension.addAll(riskEstimate.extension);
                builder.modifierExtension.addAll(riskEstimate.modifierExtension);
                builder.description = riskEstimate.description;
                builder.type = riskEstimate.type;
                builder.value = riskEstimate.value;
                builder.unitOfMeasure = riskEstimate.unitOfMeasure;
                builder.denominatorCount = riskEstimate.denominatorCount;
                builder.numeratorCount = riskEstimate.numeratorCount;
                builder.precisionEstimate.addAll(riskEstimate.precisionEstimate);
                return builder;
            }
        }

        /**
         * <p>
         * A description of the precision of the estimate for the effect.
         * </p>
         */
        public static class PrecisionEstimate extends BackboneElement {
            private final CodeableConcept type;
            private final Decimal level;
            private final Decimal from;
            private final Decimal to;

            private PrecisionEstimate(Builder builder) {
                super(builder);
                this.type = builder.type;
                this.level = builder.level;
                this.from = builder.from;
                this.to = builder.to;
            }

            /**
             * <p>
             * Examples include confidence interval and interquartile range.
             * </p>
             * 
             * @return
             *     An immutable object of type {@link CodeableConcept}.
             */
            public CodeableConcept getType() {
                return type;
            }

            /**
             * <p>
             * Use 95 for a 95% confidence interval.
             * </p>
             * 
             * @return
             *     An immutable object of type {@link Decimal}.
             */
            public Decimal getLevel() {
                return level;
            }

            /**
             * <p>
             * Lower bound of confidence interval.
             * </p>
             * 
             * @return
             *     An immutable object of type {@link Decimal}.
             */
            public Decimal getFrom() {
                return from;
            }

            /**
             * <p>
             * Upper bound of confidence interval.
             * </p>
             * 
             * @return
             *     An immutable object of type {@link Decimal}.
             */
            public Decimal getTo() {
                return to;
            }

            @Override
            public void accept(java.lang.String elementName, Visitor visitor) {
                if (visitor.preVisit(this)) {
                    visitor.visitStart(elementName, this);
                    if (visitor.visit(elementName, this)) {
                        // visit children
                        accept(id, "id", visitor);
                        accept(extension, "extension", visitor, Extension.class);
                        accept(modifierExtension, "modifierExtension", visitor, Extension.class);
                        accept(type, "type", visitor);
                        accept(level, "level", visitor);
                        accept(from, "from", visitor);
                        accept(to, "to", visitor);
                    }
                    visitor.visitEnd(elementName, this);
                    visitor.postVisit(this);
                }
            }

            @Override
            public Builder toBuilder() {
                return Builder.from(this);
            }

            public static Builder builder() {
                return new Builder();
            }

            public static class Builder extends BackboneElement.Builder {
                // optional
                private CodeableConcept type;
                private Decimal level;
                private Decimal from;
                private Decimal to;

                private Builder() {
                    super();
                }

                /**
                 * <p>
                 * Unique id for the element within a resource (for internal references). This may be any string value that does not 
                 * contain spaces.
                 * </p>
                 * 
                 * @param id
                 *     Unique id for inter-element referencing
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                @Override
                public Builder id(java.lang.String id) {
                    return (Builder) super.id(id);
                }

                /**
                 * <p>
                 * May be used to represent additional information that is not part of the basic definition of the element. To make the 
                 * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
                 * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
                 * of the definition of the extension.
                 * </p>
                 * 
                 * @param extension
                 *     Additional content defined by implementations
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                @Override
                public Builder extension(Extension... extension) {
                    return (Builder) super.extension(extension);
                }

                /**
                 * <p>
                 * May be used to represent additional information that is not part of the basic definition of the element. To make the 
                 * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
                 * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
                 * of the definition of the extension.
                 * </p>
                 * 
                 * @param extension
                 *     Additional content defined by implementations
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                @Override
                public Builder extension(Collection<Extension> extension) {
                    return (Builder) super.extension(extension);
                }

                /**
                 * <p>
                 * May be used to represent additional information that is not part of the basic definition of the element and that 
                 * modifies the understanding of the element in which it is contained and/or the understanding of the containing 
                 * element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe 
                 * and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
                 * implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the 
                 * extension. Applications processing a resource are required to check for modifier extensions.
                 * </p>
                 * <p>
                 * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
                 * change the meaning of modifierExtension itself).
                 * </p>
                 * 
                 * @param modifierExtension
                 *     Extensions that cannot be ignored even if unrecognized
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                @Override
                public Builder modifierExtension(Extension... modifierExtension) {
                    return (Builder) super.modifierExtension(modifierExtension);
                }

                /**
                 * <p>
                 * May be used to represent additional information that is not part of the basic definition of the element and that 
                 * modifies the understanding of the element in which it is contained and/or the understanding of the containing 
                 * element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe 
                 * and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
                 * implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the 
                 * extension. Applications processing a resource are required to check for modifier extensions.
                 * </p>
                 * <p>
                 * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
                 * change the meaning of modifierExtension itself).
                 * </p>
                 * 
                 * @param modifierExtension
                 *     Extensions that cannot be ignored even if unrecognized
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                @Override
                public Builder modifierExtension(Collection<Extension> modifierExtension) {
                    return (Builder) super.modifierExtension(modifierExtension);
                }

                /**
                 * <p>
                 * Examples include confidence interval and interquartile range.
                 * </p>
                 * 
                 * @param type
                 *     Type of precision estimate
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                public Builder type(CodeableConcept type) {
                    this.type = type;
                    return this;
                }

                /**
                 * <p>
                 * Use 95 for a 95% confidence interval.
                 * </p>
                 * 
                 * @param level
                 *     Level of confidence interval
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                public Builder level(Decimal level) {
                    this.level = level;
                    return this;
                }

                /**
                 * <p>
                 * Lower bound of confidence interval.
                 * </p>
                 * 
                 * @param from
                 *     Lower bound
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                public Builder from(Decimal from) {
                    this.from = from;
                    return this;
                }

                /**
                 * <p>
                 * Upper bound of confidence interval.
                 * </p>
                 * 
                 * @param to
                 *     Upper bound
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                public Builder to(Decimal to) {
                    this.to = to;
                    return this;
                }

                @Override
                public PrecisionEstimate build() {
                    return new PrecisionEstimate(this);
                }

                private static Builder from(PrecisionEstimate precisionEstimate) {
                    Builder builder = new Builder();
                    builder.id = precisionEstimate.id;
                    builder.extension.addAll(precisionEstimate.extension);
                    builder.modifierExtension.addAll(precisionEstimate.modifierExtension);
                    builder.type = precisionEstimate.type;
                    builder.level = precisionEstimate.level;
                    builder.from = precisionEstimate.from;
                    builder.to = precisionEstimate.to;
                    return builder;
                }
            }
        }
    }

    /**
     * <p>
     * A description of the certainty of the risk estimate.
     * </p>
     */
    public static class Certainty extends BackboneElement {
        private final List<CodeableConcept> rating;
        private final List<Annotation> note;
        private final List<CertaintySubcomponent> certaintySubcomponent;

        private Certainty(Builder builder) {
            super(builder);
            this.rating = builder.rating;
            this.note = builder.note;
            this.certaintySubcomponent = builder.certaintySubcomponent;
        }

        /**
         * <p>
         * A rating of the certainty of the effect estimate.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link CodeableConcept}.
         */
        public List<CodeableConcept> getRating() {
            return rating;
        }

        /**
         * <p>
         * A human-readable string to clarify or explain concepts about the resource.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link Annotation}.
         */
        public List<Annotation> getNote() {
            return note;
        }

        /**
         * <p>
         * A description of a component of the overall certainty.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link CertaintySubcomponent}.
         */
        public List<CertaintySubcomponent> getCertaintySubcomponent() {
            return certaintySubcomponent;
        }

        @Override
        public void accept(java.lang.String elementName, Visitor visitor) {
            if (visitor.preVisit(this)) {
                visitor.visitStart(elementName, this);
                if (visitor.visit(elementName, this)) {
                    // visit children
                    accept(id, "id", visitor);
                    accept(extension, "extension", visitor, Extension.class);
                    accept(modifierExtension, "modifierExtension", visitor, Extension.class);
                    accept(rating, "rating", visitor, CodeableConcept.class);
                    accept(note, "note", visitor, Annotation.class);
                    accept(certaintySubcomponent, "certaintySubcomponent", visitor, CertaintySubcomponent.class);
                }
                visitor.visitEnd(elementName, this);
                visitor.postVisit(this);
            }
        }

        @Override
        public Builder toBuilder() {
            return Builder.from(this);
        }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder extends BackboneElement.Builder {
            // optional
            private List<CodeableConcept> rating = new ArrayList<>();
            private List<Annotation> note = new ArrayList<>();
            private List<CertaintySubcomponent> certaintySubcomponent = new ArrayList<>();

            private Builder() {
                super();
            }

            /**
             * <p>
             * Unique id for the element within a resource (for internal references). This may be any string value that does not 
             * contain spaces.
             * </p>
             * 
             * @param id
             *     Unique id for inter-element referencing
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder id(java.lang.String id) {
                return (Builder) super.id(id);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element. To make the 
             * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
             * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
             * of the definition of the extension.
             * </p>
             * 
             * @param extension
             *     Additional content defined by implementations
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder extension(Extension... extension) {
                return (Builder) super.extension(extension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element. To make the 
             * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
             * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
             * of the definition of the extension.
             * </p>
             * 
             * @param extension
             *     Additional content defined by implementations
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder extension(Collection<Extension> extension) {
                return (Builder) super.extension(extension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element and that 
             * modifies the understanding of the element in which it is contained and/or the understanding of the containing 
             * element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe 
             * and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
             * implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the 
             * extension. Applications processing a resource are required to check for modifier extensions.
             * </p>
             * <p>
             * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
             * change the meaning of modifierExtension itself).
             * </p>
             * 
             * @param modifierExtension
             *     Extensions that cannot be ignored even if unrecognized
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder modifierExtension(Extension... modifierExtension) {
                return (Builder) super.modifierExtension(modifierExtension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element and that 
             * modifies the understanding of the element in which it is contained and/or the understanding of the containing 
             * element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe 
             * and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
             * implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the 
             * extension. Applications processing a resource are required to check for modifier extensions.
             * </p>
             * <p>
             * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
             * change the meaning of modifierExtension itself).
             * </p>
             * 
             * @param modifierExtension
             *     Extensions that cannot be ignored even if unrecognized
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder modifierExtension(Collection<Extension> modifierExtension) {
                return (Builder) super.modifierExtension(modifierExtension);
            }

            /**
             * <p>
             * A rating of the certainty of the effect estimate.
             * </p>
             * 
             * @param rating
             *     Certainty rating
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder rating(CodeableConcept... rating) {
                for (CodeableConcept value : rating) {
                    this.rating.add(value);
                }
                return this;
            }

            /**
             * <p>
             * A rating of the certainty of the effect estimate.
             * </p>
             * 
             * @param rating
             *     Certainty rating
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder rating(Collection<CodeableConcept> rating) {
                this.rating.addAll(rating);
                return this;
            }

            /**
             * <p>
             * A human-readable string to clarify or explain concepts about the resource.
             * </p>
             * 
             * @param note
             *     Used for footnotes or explanatory notes
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder note(Annotation... note) {
                for (Annotation value : note) {
                    this.note.add(value);
                }
                return this;
            }

            /**
             * <p>
             * A human-readable string to clarify or explain concepts about the resource.
             * </p>
             * 
             * @param note
             *     Used for footnotes or explanatory notes
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder note(Collection<Annotation> note) {
                this.note.addAll(note);
                return this;
            }

            /**
             * <p>
             * A description of a component of the overall certainty.
             * </p>
             * 
             * @param certaintySubcomponent
             *     A component that contributes to the overall certainty
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder certaintySubcomponent(CertaintySubcomponent... certaintySubcomponent) {
                for (CertaintySubcomponent value : certaintySubcomponent) {
                    this.certaintySubcomponent.add(value);
                }
                return this;
            }

            /**
             * <p>
             * A description of a component of the overall certainty.
             * </p>
             * 
             * @param certaintySubcomponent
             *     A component that contributes to the overall certainty
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder certaintySubcomponent(Collection<CertaintySubcomponent> certaintySubcomponent) {
                this.certaintySubcomponent.addAll(certaintySubcomponent);
                return this;
            }

            @Override
            public Certainty build() {
                return new Certainty(this);
            }

            private static Builder from(Certainty certainty) {
                Builder builder = new Builder();
                builder.id = certainty.id;
                builder.extension.addAll(certainty.extension);
                builder.modifierExtension.addAll(certainty.modifierExtension);
                builder.rating.addAll(certainty.rating);
                builder.note.addAll(certainty.note);
                builder.certaintySubcomponent.addAll(certainty.certaintySubcomponent);
                return builder;
            }
        }

        /**
         * <p>
         * A description of a component of the overall certainty.
         * </p>
         */
        public static class CertaintySubcomponent extends BackboneElement {
            private final CodeableConcept type;
            private final List<CodeableConcept> rating;
            private final List<Annotation> note;

            private CertaintySubcomponent(Builder builder) {
                super(builder);
                this.type = builder.type;
                this.rating = builder.rating;
                this.note = builder.note;
            }

            /**
             * <p>
             * Type of subcomponent of certainty rating.
             * </p>
             * 
             * @return
             *     An immutable object of type {@link CodeableConcept}.
             */
            public CodeableConcept getType() {
                return type;
            }

            /**
             * <p>
             * A rating of a subcomponent of rating certainty.
             * </p>
             * 
             * @return
             *     A list containing immutable objects of type {@link CodeableConcept}.
             */
            public List<CodeableConcept> getRating() {
                return rating;
            }

            /**
             * <p>
             * A human-readable string to clarify or explain concepts about the resource.
             * </p>
             * 
             * @return
             *     A list containing immutable objects of type {@link Annotation}.
             */
            public List<Annotation> getNote() {
                return note;
            }

            @Override
            public void accept(java.lang.String elementName, Visitor visitor) {
                if (visitor.preVisit(this)) {
                    visitor.visitStart(elementName, this);
                    if (visitor.visit(elementName, this)) {
                        // visit children
                        accept(id, "id", visitor);
                        accept(extension, "extension", visitor, Extension.class);
                        accept(modifierExtension, "modifierExtension", visitor, Extension.class);
                        accept(type, "type", visitor);
                        accept(rating, "rating", visitor, CodeableConcept.class);
                        accept(note, "note", visitor, Annotation.class);
                    }
                    visitor.visitEnd(elementName, this);
                    visitor.postVisit(this);
                }
            }

            @Override
            public Builder toBuilder() {
                return Builder.from(this);
            }

            public static Builder builder() {
                return new Builder();
            }

            public static class Builder extends BackboneElement.Builder {
                // optional
                private CodeableConcept type;
                private List<CodeableConcept> rating = new ArrayList<>();
                private List<Annotation> note = new ArrayList<>();

                private Builder() {
                    super();
                }

                /**
                 * <p>
                 * Unique id for the element within a resource (for internal references). This may be any string value that does not 
                 * contain spaces.
                 * </p>
                 * 
                 * @param id
                 *     Unique id for inter-element referencing
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                @Override
                public Builder id(java.lang.String id) {
                    return (Builder) super.id(id);
                }

                /**
                 * <p>
                 * May be used to represent additional information that is not part of the basic definition of the element. To make the 
                 * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
                 * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
                 * of the definition of the extension.
                 * </p>
                 * 
                 * @param extension
                 *     Additional content defined by implementations
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                @Override
                public Builder extension(Extension... extension) {
                    return (Builder) super.extension(extension);
                }

                /**
                 * <p>
                 * May be used to represent additional information that is not part of the basic definition of the element. To make the 
                 * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
                 * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
                 * of the definition of the extension.
                 * </p>
                 * 
                 * @param extension
                 *     Additional content defined by implementations
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                @Override
                public Builder extension(Collection<Extension> extension) {
                    return (Builder) super.extension(extension);
                }

                /**
                 * <p>
                 * May be used to represent additional information that is not part of the basic definition of the element and that 
                 * modifies the understanding of the element in which it is contained and/or the understanding of the containing 
                 * element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe 
                 * and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
                 * implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the 
                 * extension. Applications processing a resource are required to check for modifier extensions.
                 * </p>
                 * <p>
                 * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
                 * change the meaning of modifierExtension itself).
                 * </p>
                 * 
                 * @param modifierExtension
                 *     Extensions that cannot be ignored even if unrecognized
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                @Override
                public Builder modifierExtension(Extension... modifierExtension) {
                    return (Builder) super.modifierExtension(modifierExtension);
                }

                /**
                 * <p>
                 * May be used to represent additional information that is not part of the basic definition of the element and that 
                 * modifies the understanding of the element in which it is contained and/or the understanding of the containing 
                 * element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe 
                 * and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
                 * implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the 
                 * extension. Applications processing a resource are required to check for modifier extensions.
                 * </p>
                 * <p>
                 * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
                 * change the meaning of modifierExtension itself).
                 * </p>
                 * 
                 * @param modifierExtension
                 *     Extensions that cannot be ignored even if unrecognized
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                @Override
                public Builder modifierExtension(Collection<Extension> modifierExtension) {
                    return (Builder) super.modifierExtension(modifierExtension);
                }

                /**
                 * <p>
                 * Type of subcomponent of certainty rating.
                 * </p>
                 * 
                 * @param type
                 *     Type of subcomponent of certainty rating
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                public Builder type(CodeableConcept type) {
                    this.type = type;
                    return this;
                }

                /**
                 * <p>
                 * A rating of a subcomponent of rating certainty.
                 * </p>
                 * 
                 * @param rating
                 *     Subcomponent certainty rating
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                public Builder rating(CodeableConcept... rating) {
                    for (CodeableConcept value : rating) {
                        this.rating.add(value);
                    }
                    return this;
                }

                /**
                 * <p>
                 * A rating of a subcomponent of rating certainty.
                 * </p>
                 * 
                 * @param rating
                 *     Subcomponent certainty rating
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                public Builder rating(Collection<CodeableConcept> rating) {
                    this.rating.addAll(rating);
                    return this;
                }

                /**
                 * <p>
                 * A human-readable string to clarify or explain concepts about the resource.
                 * </p>
                 * 
                 * @param note
                 *     Used for footnotes or explanatory notes
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                public Builder note(Annotation... note) {
                    for (Annotation value : note) {
                        this.note.add(value);
                    }
                    return this;
                }

                /**
                 * <p>
                 * A human-readable string to clarify or explain concepts about the resource.
                 * </p>
                 * 
                 * @param note
                 *     Used for footnotes or explanatory notes
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                public Builder note(Collection<Annotation> note) {
                    this.note.addAll(note);
                    return this;
                }

                @Override
                public CertaintySubcomponent build() {
                    return new CertaintySubcomponent(this);
                }

                private static Builder from(CertaintySubcomponent certaintySubcomponent) {
                    Builder builder = new Builder();
                    builder.id = certaintySubcomponent.id;
                    builder.extension.addAll(certaintySubcomponent.extension);
                    builder.modifierExtension.addAll(certaintySubcomponent.modifierExtension);
                    builder.type = certaintySubcomponent.type;
                    builder.rating.addAll(certaintySubcomponent.rating);
                    builder.note.addAll(certaintySubcomponent.note);
                    return builder;
                }
            }
        }
    }
}
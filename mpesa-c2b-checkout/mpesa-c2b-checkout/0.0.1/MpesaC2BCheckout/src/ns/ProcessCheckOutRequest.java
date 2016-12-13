/**
 * ProcessCheckOutRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package ns;

/**
 * ProcessCheckOutRequest bean class
 */
@SuppressWarnings({ "unchecked", "unused" })
public class ProcessCheckOutRequest implements org.apache.axis2.databinding.ADBBean {

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("tns:ns",
			"processCheckOutRequest", "ns1");

	/**
	 * field for MERCHANT_TRANSACTION_ID
	 */

	protected java.lang.String localMERCHANT_TRANSACTION_ID;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getMERCHANT_TRANSACTION_ID() {
		return localMERCHANT_TRANSACTION_ID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            MERCHANT_TRANSACTION_ID
	 */
	public void setMERCHANT_TRANSACTION_ID(java.lang.String param) {

		this.localMERCHANT_TRANSACTION_ID = param;

	}

	/**
	 * field for REFERENCE_ID
	 */

	protected java.lang.String localREFERENCE_ID;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getREFERENCE_ID() {
		return localREFERENCE_ID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            REFERENCE_ID
	 */
	public void setREFERENCE_ID(java.lang.String param) {

		this.localREFERENCE_ID = param;

	}

	/**
	 * field for AMOUNT
	 */

	protected double localAMOUNT;

	/**
	 * Auto generated getter method
	 * 
	 * @return double
	 */
	public double getAMOUNT() {
		return localAMOUNT;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            AMOUNT
	 */
	public void setAMOUNT(double param) {

		this.localAMOUNT = param;

	}

	/**
	 * field for MSISDN
	 */

	protected java.lang.String localMSISDN;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getMSISDN() {
		return localMSISDN;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            MSISDN
	 */
	public void setMSISDN(java.lang.String param) {

		this.localMSISDN = param;

	}

	/**
	 * field for ENC_PARAMS
	 */

	protected java.lang.String localENC_PARAMS;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localENC_PARAMSTracker = false;

	public boolean isENC_PARAMSSpecified() {
		return localENC_PARAMSTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getENC_PARAMS() {
		return localENC_PARAMS;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ENC_PARAMS
	 */
	public void setENC_PARAMS(java.lang.String param) {
		localENC_PARAMSTracker = param != null;

		this.localENC_PARAMS = param;

	}

	/**
	 * field for CALL_BACK_URL
	 */

	protected java.lang.String localCALL_BACK_URL;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getCALL_BACK_URL() {
		return localCALL_BACK_URL;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            CALL_BACK_URL
	 */
	public void setCALL_BACK_URL(java.lang.String param) {

		this.localCALL_BACK_URL = param;

	}

	/**
	 * field for CALL_BACK_METHOD
	 */

	protected java.lang.String localCALL_BACK_METHOD;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getCALL_BACK_METHOD() {
		return localCALL_BACK_METHOD;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            CALL_BACK_METHOD
	 */
	public void setCALL_BACK_METHOD(java.lang.String param) {

		this.localCALL_BACK_METHOD = param;

	}

	/**
	 * field for TIMESTAMP
	 */

	protected java.lang.String localTIMESTAMP;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localTIMESTAMPTracker = false;

	public boolean isTIMESTAMPSpecified() {
		return localTIMESTAMPTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getTIMESTAMP() {
		return localTIMESTAMP;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            TIMESTAMP
	 */
	public void setTIMESTAMP(java.lang.String param) {
		localTIMESTAMPTracker = param != null;

		this.localTIMESTAMP = param;

	}

	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

		org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
		return factory.createOMElement(dataSource, MY_QNAME);

	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
		serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
			boolean serializeType)
			throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

		java.lang.String prefix = null;
		java.lang.String namespace = null;

		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();
		writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

		if (serializeType) {

			java.lang.String namespacePrefix = registerPrefix(xmlWriter, "tns:ns");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":processCheckOutRequest", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "processCheckOutRequest",
						xmlWriter);
			}

		}

		namespace = "";
		writeStartElement(null, namespace, "MERCHANT_TRANSACTION_ID", xmlWriter);

		if (localMERCHANT_TRANSACTION_ID == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("MERCHANT_TRANSACTION_ID cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localMERCHANT_TRANSACTION_ID);

		}

		xmlWriter.writeEndElement();

		namespace = "";
		writeStartElement(null, namespace, "REFERENCE_ID", xmlWriter);

		if (localREFERENCE_ID == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("REFERENCE_ID cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localREFERENCE_ID);

		}

		xmlWriter.writeEndElement();

		namespace = "";
		writeStartElement(null, namespace, "AMOUNT", xmlWriter);

		if (java.lang.Double.isNaN(localAMOUNT)) {

			throw new org.apache.axis2.databinding.ADBException("AMOUNT cannot be null!!");

		} else {
			xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAMOUNT));
		}

		xmlWriter.writeEndElement();

		namespace = "";
		writeStartElement(null, namespace, "MSISDN", xmlWriter);

		if (localMSISDN == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("MSISDN cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localMSISDN);

		}

		xmlWriter.writeEndElement();
		if (localENC_PARAMSTracker) {
			namespace = "";
			writeStartElement(null, namespace, "ENC_PARAMS", xmlWriter);

			if (localENC_PARAMS == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException("ENC_PARAMS cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localENC_PARAMS);

			}

			xmlWriter.writeEndElement();
		}
		namespace = "";
		writeStartElement(null, namespace, "CALL_BACK_URL", xmlWriter);

		if (localCALL_BACK_URL == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("CALL_BACK_URL cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localCALL_BACK_URL);

		}

		xmlWriter.writeEndElement();

		namespace = "";
		writeStartElement(null, namespace, "CALL_BACK_METHOD", xmlWriter);

		if (localCALL_BACK_METHOD == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("CALL_BACK_METHOD cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localCALL_BACK_METHOD);

		}

		xmlWriter.writeEndElement();
		if (localTIMESTAMPTracker) {
			namespace = "";
			writeStartElement(null, namespace, "TIMESTAMP", xmlWriter);

			if (localTIMESTAMP == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException("TIMESTAMP cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localTIMESTAMP);

			}

			xmlWriter.writeEndElement();
		}
		xmlWriter.writeEndElement();

	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("tns:ns")) {
			return "ns1";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
			javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
		java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
		if (writerPrefix != null) {
			xmlWriter.writeStartElement(namespace, localPart);
		} else {
			if (namespace.length() == 0) {
				prefix = "";
			} else if (prefix == null) {
				prefix = generatePrefix(namespace);
			}

			xmlWriter.writeStartElement(prefix, localPart, namespace);
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
			java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		if (xmlWriter.getPrefix(namespace) == null) {
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
		xmlWriter.writeAttribute(namespace, attName, attValue);
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
			javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		java.lang.String attributeNamespace = qname.getNamespaceURI();
		java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
		if (attributePrefix == null) {
			attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
		}
		java.lang.String attributeValue;
		if (attributePrefix.trim().length() > 0) {
			attributeValue = attributePrefix + ":" + qname.getLocalPart();
		} else {
			attributeValue = qname.getLocalPart();
		}

		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attributeValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attributeValue);
		}
	}

	/**
	 * method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String namespaceURI = qname.getNamespaceURI();
		if (namespaceURI != null) {
			java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
			if (prefix == null) {
				prefix = generatePrefix(namespaceURI);
				xmlWriter.writeNamespace(prefix, namespaceURI);
				xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
				xmlWriter.writeCharacters(
						prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			} else {
				// i.e this is the default namespace
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}

		} else {
			xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		}
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		if (qnames != null) {
			// we have to store this data until last moment since it is not
			// possible to write any
			// namespace data after writing the charactor data
			java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
			java.lang.String namespaceURI = null;
			java.lang.String prefix = null;

			for (int i = 0; i < qnames.length; i++) {
				if (i > 0) {
					stringToWrite.append(" ");
				}
				namespaceURI = qnames[i].getNamespaceURI();
				if (namespaceURI != null) {
					prefix = xmlWriter.getPrefix(namespaceURI);
					if ((prefix == null) || (prefix.length() == 0)) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix, namespaceURI);
					}

					if (prefix.trim().length() > 0) {
						stringToWrite.append(prefix).append(":")
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				} else {
					stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
				}
			}
			xmlWriter.writeCharacters(stringToWrite.toString());
		}

	}

	/**
	 * Register a namespace prefix
	 */
	private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String prefix = xmlWriter.getPrefix(namespace);
		if (prefix == null) {
			prefix = generatePrefix(namespace);
			javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
			while (true) {
				java.lang.String uri = nsContext.getNamespaceURI(prefix);
				if (uri == null || uri.length() == 0) {
					break;
				}
				prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
			}
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
		return prefix;
	}

	/**
	 * databinding method to get an XML representation of this object
	 *
	 */
	public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
			throws org.apache.axis2.databinding.ADBException {

		java.util.ArrayList elementList = new java.util.ArrayList();
		java.util.ArrayList attribList = new java.util.ArrayList();

		elementList.add(new javax.xml.namespace.QName("", "MERCHANT_TRANSACTION_ID"));

		if (localMERCHANT_TRANSACTION_ID != null) {
			elementList.add(
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMERCHANT_TRANSACTION_ID));
		} else {
			throw new org.apache.axis2.databinding.ADBException("MERCHANT_TRANSACTION_ID cannot be null!!");
		}

		elementList.add(new javax.xml.namespace.QName("", "REFERENCE_ID"));

		if (localREFERENCE_ID != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localREFERENCE_ID));
		} else {
			throw new org.apache.axis2.databinding.ADBException("REFERENCE_ID cannot be null!!");
		}

		elementList.add(new javax.xml.namespace.QName("", "AMOUNT"));

		elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAMOUNT));

		elementList.add(new javax.xml.namespace.QName("", "MSISDN"));

		if (localMSISDN != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMSISDN));
		} else {
			throw new org.apache.axis2.databinding.ADBException("MSISDN cannot be null!!");
		}
		if (localENC_PARAMSTracker) {
			elementList.add(new javax.xml.namespace.QName("", "ENC_PARAMS"));

			if (localENC_PARAMS != null) {
				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localENC_PARAMS));
			} else {
				throw new org.apache.axis2.databinding.ADBException("ENC_PARAMS cannot be null!!");
			}
		}
		elementList.add(new javax.xml.namespace.QName("", "CALL_BACK_URL"));

		if (localCALL_BACK_URL != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCALL_BACK_URL));
		} else {
			throw new org.apache.axis2.databinding.ADBException("CALL_BACK_URL cannot be null!!");
		}

		elementList.add(new javax.xml.namespace.QName("", "CALL_BACK_METHOD"));

		if (localCALL_BACK_METHOD != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCALL_BACK_METHOD));
		} else {
			throw new org.apache.axis2.databinding.ADBException("CALL_BACK_METHOD cannot be null!!");
		}
		if (localTIMESTAMPTracker) {
			elementList.add(new javax.xml.namespace.QName("", "TIMESTAMP"));

			if (localTIMESTAMP != null) {
				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTIMESTAMP));
			} else {
				throw new org.apache.axis2.databinding.ADBException("TIMESTAMP cannot be null!!");
			}
		}

		return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
				attribList.toArray());

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

		/**
		 * static method to create the object Precondition: If this object is an
		 * element, the current or next start element starts this object and any
		 * intervening reader events are ignorable If this object is not an
		 * element, it is a complex type and the reader is at the event just
		 * after the outer start element Postcondition: If this object is an
		 * element, the reader is positioned at its end element If this object
		 * is a complex type, the reader is positioned at the end element of its
		 * outer element
		 */
		public static ProcessCheckOutRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
			ProcessCheckOutRequest object = new ProcessCheckOutRequest();

			int event;
			java.lang.String nillableValue = null;
			java.lang.String prefix = "";
			java.lang.String namespaceuri = "";
			try {

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
					java.lang.String fullTypeName = reader
							.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
					if (fullTypeName != null) {
						java.lang.String nsPrefix = null;
						if (fullTypeName.indexOf(":") > -1) {
							nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
						}
						nsPrefix = nsPrefix == null ? "" : nsPrefix;

						java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

						if (!"processCheckOutRequest".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
							return (ProcessCheckOutRequest) ns.ExtensionMapper.getTypeObject(nsUri, type, reader);
						}

					}

				}

				// Note all attributes that were handled. Used to differ normal
				// attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "MERCHANT_TRANSACTION_ID").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "MERCHANT_TRANSACTION_ID" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setMERCHANT_TRANSACTION_ID(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "REFERENCE_ID").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "REFERENCE_ID" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setREFERENCE_ID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("", "AMOUNT").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "AMOUNT" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setAMOUNT(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("", "MSISDN").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "MSISDN" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setMSISDN(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "ENC_PARAMS").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "ENC_PARAMS" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setENC_PARAMS(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "CALL_BACK_URL").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "CALL_BACK_URL" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setCALL_BACK_URL(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "CALL_BACK_METHOD").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "CALL_BACK_METHOD" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setCALL_BACK_METHOD(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "TIMESTAMP").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "TIMESTAMP" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setTIMESTAMP(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement())
					// A start element we are not expecting indicates a trailing
					// invalid property
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

			} catch (javax.xml.stream.XMLStreamException e) {
				throw new java.lang.Exception(e);
			}

			return object;
		}

	}// end of factory class

}

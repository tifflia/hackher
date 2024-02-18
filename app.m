
clear 

cam = webcam(1);
load myNet1;
x=0;
y=0;
height=300;
width=300;
box=[x y height width];

while true
    video = snapshot(cam);
    annoted_video = insertObjectAnnotation(video,'rectangle',box,'  Detection Area');   
    video_cropped =imcrop(annoted_video,box);
    my_video =imresize(video_cropped,[227 227]);
    label=classify(myNet1,my_video);
    imshow(annoted_video);
    title(char(label));
    drawnow;
end